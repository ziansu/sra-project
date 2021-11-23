public void addPlayer(javax.websocket.Session session) {
    connectedPlayers.put(session, new Player(session.getId()));
    java.lang.System.out.println(("PLAYER CREATED :: " + (connectedPlayers.size())));
}