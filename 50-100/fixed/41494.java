private void updatePlayer(io.minecloud.models.server.Server server, io.minecloud.models.player.PlayerData data) {
    java.util.List<io.minecloud.models.player.PlayerData> onlinePlayers = server.onlinePlayers();
    onlinePlayers.set(onlinePlayers.lastIndexOf(data), data);
    server.setOnlinePlayers(onlinePlayers);
    plugin.mongo().repositoryBy(io.minecloud.models.server.Server.class).save(server);
}