@java.lang.Override
public void setPlayerBar(org.bukkit.entity.Player player, java.lang.String title, double percent) {
    org.bukkit.boss.BossBar bar = bars.get(player.getName());
    if (bar == null) {
        bar = org.bukkit.Bukkit.createBossBar(org.bukkit.ChatColor.translateAlternateColorCodes('&', title), BarColor.PURPLE, BarStyle.SOLID);
        bars.put(player.getName(), bar);
    }
    bar.setTitle(org.bukkit.ChatColor.translateAlternateColorCodes('&', title));
    bar.setProgress(percent);
    bar.addPlayer(player);
}