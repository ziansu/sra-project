@java.lang.Override
public void run() {
    for (org.bukkit.entity.Player player : org.bukkit.Bukkit.getOnlinePlayers()) {
        java.lang.String playerName = player.getName();
        org.bukkit.scoreboard.Team playerTeam = org.bukkit.Bukkit.getScoreboardManager().getMainScoreboard().getEntryTeam(playerName);
        player.setDisplayName((((playerTeam.getPrefix()) + playerName) + (playerTeam.getSuffix())));
    }
}