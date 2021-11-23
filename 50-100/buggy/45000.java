public void onDisable() {
    for (java.util.Map.Entry<java.util.UUID, me.lennartVH01.BuiltinBlockMarker.MarkedTask> playerEntry : playerMap.entrySet()) {
        playerEntry.getValue().cancelTask();
        removeEntitys(plugin.getServer().getPlayer(playerEntry.getKey()), playerEntry.getValue().ids, playerEntry.getValue().entities);
    }
}