public void updateScores() {
    for (int i = 0; i < (NumOfTeams); i++) {
        if (((mode) == 1) && ((Scores[i]) >= (goalRounds))) {
            gameEnd();
        }
        teamScores[i].setText(((Scores[i]) + ""));
    }
}