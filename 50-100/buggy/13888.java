public void removeConnection(gamelogic.map.Connection connection) {
    gamelogic.player.Player connectionOwner = connection.getOwner();
    if (connectionOwner != null) {
        connectionOwner.removeOwnedConnection(connection);
    }
    while (connections.contains(connection)) {
        connections.remove(connection);
    } 
    distances.clear();
    computeDistances();
}