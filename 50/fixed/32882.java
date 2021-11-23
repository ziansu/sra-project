public java.lang.String getNextPlayerTeamB() {
    if ((++(playerTurnCounterOfTeamB)) == (com.example.michael.archerygame.TaskFragment.playerListOfTeamB.size()))
        playerTurnCounterOfTeamB = 0;
    
    return com.example.michael.archerygame.TaskFragment.playerListOfTeamB.get(playerTurnCounterOfTeamB);
}