@java.lang.Override
public void run() {
    for (org.bukkit.entity.Player player : org.bukkit.Bukkit.getOnlinePlayers()) {
        java.lang.String playerName = player.getName();
        org.bukkit.scoreboard.Team playerTeam = org.bukkit.Bukkit.getScoreboardManager().getMainScoreboard().getEntryTeam(playerName);
        if (playerTeam != null)
            player.setDisplayName((((playerTeam.getPrefix()) + playerName) + (playerTeam.getSuffix())));
        else
            player.setDisplayName(playerName);
        
    }
}