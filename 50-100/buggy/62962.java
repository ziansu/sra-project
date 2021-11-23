@java.lang.Override
public java.lang.Double operate(java.util.List<edu.uci.eecs.wukong.framework.buffer.DataPoint<java.lang.Short>> data) throws java.lang.Exception {
    if ((data.size()) == 0) {
        return 0.0;
    }
    java.lang.Double avr = new java.lang.Double(0);
    for (edu.uci.eecs.wukong.framework.buffer.DataPoint<java.lang.Short> point : data) {
        avr += point.getValue().doubleValue();
    }
    return avr;
}