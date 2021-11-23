@java.lang.Override
public void StartTurn() {
    turnData = ((org.json.simple.JSONObject) (gameData.get(java.lang.String.valueOf(this.turnCount))));
    addNewTrains();
    buyNewStations();
    playerTurn.lineBonuses();
    playerTurn.stationRewards();
    addStationFaults();
    addStationLocks();
    updatePlayerScores();
    updatePlayerCards();
    updateGoals();
    updateResources();
    for (com.TeamHEC.LocomotionCommotion.Goal.Goal goal : playerTurn.getGoals()) {
        goal.incrementCurrentGoalDuration();
    }
    addNewConnections();
}