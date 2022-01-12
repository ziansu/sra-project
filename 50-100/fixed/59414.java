public static void setTrue(org.spongepowered.api.entity.living.player.Player player, java.lang.String kit) {
    ninja.leaping.configurate.loader.ConfigurationLoader<ninja.leaping.configurate.commented.CommentedConfigurationNode> configManager = io.github.hsyyid.kits.Kits.getConfigManager();
    Kits.config.getNode("players", player.getUniqueId().toString(), kit, "usable").setValue(true);
    try {
        configManager.save(Kits.config);
        configManager.load();
    } catch (java.io.IOException e) {
        java.lang.System.out.println("[Kits]: Failed to save config!");
    }
}