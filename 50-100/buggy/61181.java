private void addScore(java.lang.String playerName, int score) {
    SunDevilDice.ScoreObj currentScore = new SunDevilDice.ScoreObj(playerName, score);
    int index = 0;
    while ((score < (highScores.get(index).score)) && (index < 10)) {
        index++;
    } 
    if (index != 10) {
        if ((highScores.size()) == 10) {
            highScores.remove(9);
        }
        highScores.add(index, currentScore);
    }
}