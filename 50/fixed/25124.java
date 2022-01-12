public double[] getVelocity() {
    return java.util.Arrays.copyOfRange(values, (2 * (dim)), (3 * (dim)));
}