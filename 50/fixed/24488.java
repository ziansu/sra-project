public java.lang.Double getWorstGame() {
    java.lang.Double worstGame = java.lang.Double.MAX_VALUE;
    for (java.lang.Double score : scores) {
        if ((score < worstGame) && (score > 0)) {
            worstGame = score;
        }
    }
    return worstGame;
}