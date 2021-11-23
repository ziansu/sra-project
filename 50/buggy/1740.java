@java.lang.Override
public final org.renjin.primitives.summary.Vector forceResult() {
    if (!(calculated)) {
        calculate();
    }
    return new org.renjin.primitives.summary.DoubleArrayVector(result);
}