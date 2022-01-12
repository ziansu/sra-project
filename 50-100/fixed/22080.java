@java.lang.Override
public void StartTurn() {
    turnData = ((org.json.simple.JSONObject) (gameData.get(java.lang.String.valueOf(this.turnCount))));
    playerTurn.lineBonuses();
    playerTurn.stationRewards();
    addStationFaults();
    addStationLocks();
    updatePlayerScores();
    updatePlayerCards();
    updateGoals();
    for (com.TeamHEC.LocomotionCommotion.Goal.Goal goal : playerTurn.getGoals()) {
        goal.incrementCurrentGoalDuration();
    }
    addNewConnections();
    updateResources();
    addNewTrains();
    buyNewStations();
}