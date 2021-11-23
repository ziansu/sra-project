@java.lang.Override
public java.lang.Number getValue() {
    java.lang.Number result = adder.intValue();
    adder = new java.util.concurrent.atomic.LongAdder();
    return result;
}