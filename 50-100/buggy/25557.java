public static com.player.specific.config.utils.ConfigManager getConfig(org.bukkit.entity.Player p) {
    if (com.player.specific.config.utils.ConfigManager.configs.contains(p)) {
        for (int i = 0; i < (com.player.specific.config.utils.ConfigManager.configs.size()); i++) {
            if (com.player.specific.config.utils.ConfigManager.configs.get(i).getOwner().equals(p)) {
                return com.player.specific.config.utils.ConfigManager.configs.get(i);
            }
        }
    }
    return new com.player.specific.config.utils.ConfigManager(p);
}