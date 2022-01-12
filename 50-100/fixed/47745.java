public int computeScore(java.lang.String word) {
    int scoreValue = 0;
    word = word.toLowerCase();
    for (int i = 0; i < (word.length()); i++) {
        char c = word.charAt(i);
        scoreValue += scores.get(c);
    }
    return scoreValue;
}