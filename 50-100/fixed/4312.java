private void setPlayerGoalPositionsInPossession() {
    java.util.List<AI.Player> newPlayers = new java.util.ArrayList<AI.Player>(players);
    AI.Player ballPossessor = newPlayers.get(pitch.getBallPossessorPlayerID());
    setPlayerGoalPositionsBallPossessor(ballPossessor);
    newPlayers.remove(team.getGoalKeeperID());
    newPlayers.remove(ballPossessor);
    spreadOut(newPlayers);
}