public static void reloadPlayersMap() {
    uk.co.tggl.pluckerpluck.multiinv.listener.MIPlayerListener.players.clear();
    for (org.bukkit.entity.Player player : org.bukkit.Bukkit.getServer().getOnlinePlayers()) {
        uk.co.tggl.pluckerpluck.multiinv.listener.MIPlayerListener.players.put(player, new uk.co.tggl.pluckerpluck.multiinv.player.MIPlayer(player));
    }
}