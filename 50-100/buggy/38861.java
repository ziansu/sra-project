public void useTeamTurn() {
    (teamTurn)++;
    if ((teamTurn) > (TEAMS)) {
        teamTurn = 1;
    }
    int count = 0;
    while ((teamRemaining[((teamTurn) - 1)]) <= 0) {
        (teamTurn)++;
        if ((teamTurn) > (TEAMS)) {
            teamTurn = 1;
        }
        if (count > 5) {
            shouldGameOver = true;
            break;
        }
        count++;
    } 
    updateTeamTurn = false;
}