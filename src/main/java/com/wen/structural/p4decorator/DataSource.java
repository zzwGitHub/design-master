package com.wen.structural.p4decorator;

/**
 * @author Wen
 * @date 2021-11-23 16:43
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
