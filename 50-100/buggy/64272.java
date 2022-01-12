@org.bukkit.event.EventHandler
public void onPlayerKick(org.bukkit.event.player.PlayerKickEvent e) {
    e.setLeaveMessage((((e.getPlayer().getDisplayName()) + (org.bukkit.ChatColor.RED)) + " has left the game!"));
    e.setReason(plugin.getChatFormatter().gameWarningMessage("You were kicked by an operator."));
    if (((plugin.getServer().getOnlinePlayers().size()) - 1) < (gameManager.getPlayersNeeded())) {
        gameManager.updateLobbyCountdown();
    }
}