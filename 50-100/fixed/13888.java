public void removeConnection(gamelogic.map.Connection connection) {
    gamelogic.player.Player connectionOwner = connection.getOwner();
    if (connectionOwner != null) {
        connectionOwner.removeOwnedConnection(connection);
    }
    connections.remove(connection);
    distances.clear();
    computeDistances();
}