public static void onPlayerTeleport(org.bukkit.entity.Player player, org.bukkit.Location to) {
    if (!(com.frdfsnlght.inquisitor.PlayerStats.started)) {
        return ;
    }
    if (com.frdfsnlght.inquisitor.PlayerStats.isStatsPlayer(player)) {
        com.frdfsnlght.inquisitor.PlayerStats.PlayerState state = com.frdfsnlght.inquisitor.PlayerStats.playerStates.get(player.getName());
        if (state != null) {
            com.frdfsnlght.inquisitor.PlayerStats.onPlayerMove(player, player.getLocation());
            state.lastLocation = to;
            state.lastTime = java.lang.System.currentTimeMillis();
        }
    }
}