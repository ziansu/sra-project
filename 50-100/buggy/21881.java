@java.lang.Override
protected void executeWithTarget(simpleserver.Player player, java.lang.String message, java.lang.String name) {
    simpleserver.Server server = player.getServer();
    mute(server, name);
    server.adminLog(((("Admin " + (player.getName())) + " muted player:\t ") + name));
}