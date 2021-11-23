public void translateTarget(double[] vector) {
    for (int i = 0; i < (this.position.length); i++) {
        this.position[i] += vector[i];
        this.homMatrix[i][3] += vector[i];
    }
}