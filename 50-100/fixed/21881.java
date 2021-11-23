@java.lang.Override
protected void executeWithTarget(simpleserver.Player player, java.lang.String message, java.lang.String target) {
    simpleserver.Server server = player.getServer();
    mute(server, target);
    server.adminLog(((("Admin " + (player.getName())) + " muted player:\t ") + target));
}