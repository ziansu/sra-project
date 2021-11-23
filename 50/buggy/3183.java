public void setScore(int index, double score) {
    final double bestScore = this.scores[this.best];
    if (score < bestScore) {
    }
    this.scores[index] = score;
}