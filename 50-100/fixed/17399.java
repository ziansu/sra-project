public java.lang.String getBestLabel(double[] scores) {
    int best = 0;
    double bestScore = 0.0;
    for (int d = 0; d < (scores.length); d++) {
        if ((scores[d]) >= bestScore) {
            bestScore = scores[d];
            best = d;
        }
    }
    return this.lexicon.getLabel(best);
}