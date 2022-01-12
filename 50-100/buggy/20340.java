public void init(final int numInputs, final int numFeatures) {
    this.weights = new double[numFeatures][numInputs];
    for (int i = 0; i < numInputs; i++) {
        for (int j = 0; j < numFeatures; j++) {
            weights[i][j] = 0.0;
        }
    }
}