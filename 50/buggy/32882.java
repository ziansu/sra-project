public java.lang.String getNextPlayerTeamB() {
    if ((++(playerTurnCounterOfTeamB)) == (com.example.michael.archerygame.TaskFragment.playerListOfTeamB.size()))
        playerTurnCounterOfTeamB = 0;
    
    android.util.Log.v("playerName", com.example.michael.archerygame.TaskFragment.playerListOfTeamB.get(playerTurnCounterOfTeamB));
    return com.example.michael.archerygame.TaskFragment.playerListOfTeamB.get(playerTurnCounterOfTeamB);
}