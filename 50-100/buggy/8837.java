private static int calculateScore(java.util.ArrayList<PairTime> pairTimes) {
    int score = 0;
    for (int i = 0; i < (pairTimes.size()); i++) {
        score += pairTimes.get(i).getPair().getScore();
    }
    return score;
}