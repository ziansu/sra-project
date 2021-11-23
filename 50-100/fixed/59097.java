private void categoryResultCalculating(int PlayerNumber) {
    int categoryScore;
    if ((checkCategory(dieRollResult, category)) == true) {
        setCategoryScore(PlayerNumber, category);
        categoryScore = categoryScores[PlayerNumber][category];
        display.updateScorecard(category, PlayerNumber, categoryScore);
    }else {
        categoryScores[PlayerNumber][category] = 0;
        display.updateScorecard(category, PlayerNumber, 0);
    }
}