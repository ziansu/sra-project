public server.Lobby createLobby(connection.Connection connection, java.lang.String name, java.lang.String password, server.Map map) {
    server.Lobby lobby = new server.Lobby(this, connection, name, password, map, idGenerator);
    (idGenerator)++;
    lobbys.add(lobby);
    return lobby;
}