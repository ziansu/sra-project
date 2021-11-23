public double[] getPosition() {
    return java.util.Arrays.copyOfRange(values, dim, ((2 * (dim)) - 1));
}