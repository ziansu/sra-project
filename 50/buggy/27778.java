public double[] getPrevPosition() {
    return java.util.Arrays.copyOfRange(values, 0, ((dim) - 1));
}