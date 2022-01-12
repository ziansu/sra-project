private static int getScore(java.lang.String word) {
    int score = 0;
    char[] chars = word.toCharArray();
    for (char c : chars) {
        score += com.tallbluehat.Main.SCORE_MAP.get((c + ""));
    }
    return score;
}