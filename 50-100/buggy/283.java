public int score() {
    java.util.ArrayList<java.lang.Integer> scores = possibleScores();
    int maxUnder = java.lang.Integer.MIN_VALUE;
    int minOver = java.lang.Integer.MAX_VALUE;
    for (int score : scores) {
        if ((score > 21) && (score < minOver)) {
            minOver = score;
        }else
            if ((score < 21) && (score > maxUnder)) {
                maxUnder = score;
            }
        
    }
    return maxUnder == (java.lang.Integer.MIN_VALUE) ? minOver : maxUnder;
}