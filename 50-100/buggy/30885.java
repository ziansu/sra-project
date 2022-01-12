public void reassignValues() {
    double[] tempPos = java.util.Arrays.copyOfRange(values, 0, ((dim) - 1));
    java.lang.System.arraycopy(values, dim, values, 0, dim);
    java.lang.System.arraycopy(values, dim, tempPos, 0, dim);
    org.openpixi.pixi.math.AlgebraElement tempQ = Q0;
    Q0 = Q1;
    Q1 = tempQ;
}