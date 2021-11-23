public java.lang.String getDay(org.bukkit.entity.Player p) {
    return ((org.bukkit.ChatColor.YELLOW) + (java.lang.String.valueOf(((p.getWorld().getFullTime()) / 24000)))) + "��";
}