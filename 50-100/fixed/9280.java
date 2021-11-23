public double[] calcScores() {
    for (int i = 0; i < (this.nbEntries); i++) {
        for (int j = 0; j < (this.nbMetrics); j++) {
            this.matrix[this.nbMetrics][i] += this.matrix[j][i];
        }
    }
    return this.matrix[this.nbMetrics];
}