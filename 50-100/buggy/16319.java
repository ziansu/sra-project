public void loadUsersPlayerInfo() {
    if ((pk.getServer().getOnlinePlayers().length) >= 1) {
        org.bukkit.configuration.file.FileConfiguration pIC = pk.pkVars.playerInfoConfig;
        java.util.Set<java.lang.String> keyUsers = pIC.getConfigurationSection("username").getKeys(false);
        for (org.bukkit.entity.Player player : pk.getServer().getOnlinePlayers()) {
            if (keyUsers.contains(player.getName())) {
                loadPlayerInfo(player);
            }else {
                continue;
            }
        }
    }
}