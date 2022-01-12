protected void initialize(int dimensions) {
    this.weights = new double[dimensions];
    java.util.Arrays.fill(weights, 1.0);
    this.dimensions = dimensions;
}