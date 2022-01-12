public int getScore() {
    int score = com.philbozak.dartscoring.PlayerScore.STARTING_SCORE;
    for (java.util.List<java.lang.Integer> round : rounds) {
        int roundSum = 0;
        for (java.lang.Integer shot : round) {
            if (shot == null) {
                continue;
            }
            roundSum += shot;
        }
        if (roundSum <= score) {
            score -= roundSum;
        }
    }
    return score;
}