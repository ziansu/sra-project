private boolean isValidPair(int score, int matches) {
    return ((score == 0) && (matches == 0)) || ((score > 0) && (matches >= (score / 3)));
}