public int computeScore(java.lang.String word) {
    int scoreValue = 0;
    for (int i = 0; i < (word.length()); i++) {
        char c = word.charAt(i);
        scoreValue += scores.get(c);
    }
    return scoreValue;
}