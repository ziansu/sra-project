public void updateScores() {
    for (int i = 0; i < (NumOfTeams); i++) {
        teamScores[i].setText(((Scores[i]) + ""));
        if (((mode) == 1) && ((Scores[i]) >= (goalRounds))) {
            gameEnd();
            return ;
        }
    }
}