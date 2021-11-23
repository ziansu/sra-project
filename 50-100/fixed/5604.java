public void initRandom(final int numInputs, final int numFeatures) {
    this.weights = new double[numFeatures][numInputs];
    for (int i = 0; i < numFeatures; i++) {
        for (int j = 0; j < numInputs; j++) {
            weights[i][j] = r.nextDouble();
        }
    }
}