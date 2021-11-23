public int pathDistanceToPlayer(int playerId, int opponentId) {
    java.awt.Point distances = getDeltaDistances(playerId, opponentId);
    return ((java.lang.Math.abs(distances.x)) + (java.lang.Math.abs(distances.y))) - 1;
}