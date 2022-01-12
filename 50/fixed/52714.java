protected boolean showPlayer(org.bukkit.entity.Player player) {
    java.lang.String name = player.getName();
    boolean success = hiddenPlayers.remove(name);
    sendInfoPacket(player, true);
    return success;
}