@java.lang.Override
public void run() {
    for (org.bukkit.entity.Player player : org.bukkit.Bukkit.getServer().getOnlinePlayers()) {
        com.almuramc.forgebridge.utils.ServerWorldUtil.sendAdditionalWorldInfo(player, player.getWorld().getName(), org.bukkit.Bukkit.getOnlinePlayers().size(), org.bukkit.Bukkit.getMaxPlayers());
        com.almuramc.forgebridge.utils.TitleUtil.sendDisplayName(player, p.getName(), (((org.bukkit.ChatColor.stripColor(p.getDisplayName())) + "\n") + (com.almuramc.forgebridge.utils.TitleUtil.getCustomTitle(p))));
    }
}