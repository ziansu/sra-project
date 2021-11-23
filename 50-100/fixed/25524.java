public void setPlayer(java.lang.String name) throws java.net.UnknownHostException {
    local = new backend.Player(name);
    local.setIP(java.net.InetAddress.getLocalHost().getHostAddress().toString());
    remote = new backend.Player("remote");
    game.addPlayer(local, local.getBattlefield());
    game.addPlayer(remote, remote.getBattlefield());
}