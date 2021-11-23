private void categoryResultCalculating(int PlayerNumber) {
    int categoryScore;
    selectedCategory[PlayerNumber][category] = 1;
    if ((checkCategory(dieRollResult, category)) == true) {
        setCategoryScore(PlayerNumber, category);
        categoryScore = categoryScores[PlayerNumber][category];
        display.updateScorecard(category, PlayerNumber, categoryScore);
    }else {
        categoryScores[PlayerNumber][category] = 0;
        display.updateScorecard(category, PlayerNumber, 0);
    }
}