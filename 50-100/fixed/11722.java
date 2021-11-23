public void run() {
    java.lang.String playerName = player.getName();
    org.bukkit.scoreboard.Team playerTeam = org.bukkit.Bukkit.getScoreboardManager().getMainScoreboard().getEntryTeam(playerName);
    if (playerTeam != null)
        player.setDisplayName(((((playerTeam.getPrefix()) + playerName) + (playerTeam.getSuffix())) + (org.bukkit.ChatColor.RESET)));
    else
        player.setDisplayName(playerName);
    
}