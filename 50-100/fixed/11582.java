@java.lang.Override
public void applyTo(double[] xs, int offset, int length, mikera.vectorz.AVector ys) {
    for (int i = 0; i < length; i++) {
        xs[(offset + i)] = ((java.lang.Number) (fn.invoke(xs[(offset + i)], ys.unsafeGet(i)))).doubleValue();
    }
}