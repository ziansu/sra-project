private void updateGlobalScore(double score) {
    if (score == 0) {
        (_negativeCount)++;
    }else {
        (_possitiveCount)++;
    }
}