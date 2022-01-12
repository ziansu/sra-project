private void calculateFitness() {
    int hits = 0;
    for (int i = 0; i < ((queens.length) - 1); i++) {
        for (int j = i + 1; j < (queens.length); j++) {
            if ((j - i) == (java.lang.Math.abs(((queens[j]) - (queens[i]))))) {
                hits++;
            }
        }
    }
    this.hits = hits;
}