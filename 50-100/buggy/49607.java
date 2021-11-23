public void updateName(org.bukkit.entity.Player p) {
    board.getTeam(p.getName()).setSuffix((((org.bukkit.ChatColor.LIGHT_PURPLE) + " [SP] ") + (getSoulData().get(p.getUniqueId()))));
    updateScoreboard(p);
}