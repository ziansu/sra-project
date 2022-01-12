@java.lang.Override
public void applyTo(double[] xs, int offset, int length, mikera.vectorz.AVector ys) {
    for (int i = 0; i < length; i++) {
        xs[i] = ((java.lang.Number) (fn.invoke(xs[i], ys.unsafeGet(i)))).doubleValue();
    }
}