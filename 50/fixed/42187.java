public void addPlayer(java.lang.String gameId) throws IServer.GameIsFullException {
    ServerProxy.SINGLETON.addPlayer(int_authentication_code, gameId);
}