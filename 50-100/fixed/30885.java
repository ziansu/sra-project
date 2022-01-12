public void reassignValues() {
    double[] tempPos = java.util.Arrays.copyOfRange(values, 0, dim);
    java.lang.System.arraycopy(values, dim, values, 0, dim);
    java.lang.System.arraycopy(tempPos, 0, values, dim, dim);
    org.openpixi.pixi.math.AlgebraElement tempQ = Q0;
    Q0 = Q1;
    Q1 = tempQ;
}