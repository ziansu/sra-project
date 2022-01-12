@java.lang.Override
public void add(java.lang.String name, java.lang.String id) {
    players[playersCount].setName(name);
    players[((playersCount)++)].setId(id);
    if ((playersCount) >= 2) {
        server.disalowConnections();
    }
}