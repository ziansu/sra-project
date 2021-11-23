public boolean isHighscore(int score) {
    return ((getMinScore(getAllScores())) == null) || ((getMinScore(getAllScores()).getScore()) < score);
}