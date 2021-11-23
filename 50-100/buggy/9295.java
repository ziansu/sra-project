@java.lang.Override
public void StartTurn() {
    turnData = ((org.json.simple.JSONObject) (gameData.get(java.lang.String.valueOf(this.turnCount))));
    addNewConnections();
    addStationFaults();
    updatePlayerScores();
    updatePlayerCards();
    updateGoals();
    updateResources();
    playerTurn.lineBonuses();
    playerTurn.stationRewards();
    for (com.TeamHEC.LocomotionCommotion.Goal.Goal goal : playerTurn.getGoals()) {
        goal.incrementCurrentGoalDuration();
    }
}