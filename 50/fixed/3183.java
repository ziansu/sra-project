public void setScore(int index, double score) {
    final double bestScore = this.scores[this.best];
    this.scores[index] = score;
    if (score < bestScore) {
        this.best = index;
    }
}