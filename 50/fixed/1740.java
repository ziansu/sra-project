@java.lang.Override
public final org.renjin.primitives.summary.Vector forceResult() {
    if (!(calculated)) {
        result = calculate();
    }
    return new org.renjin.primitives.summary.DoubleArrayVector(result);
}