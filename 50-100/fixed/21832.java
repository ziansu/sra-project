public boolean hasVault() {
    org.bukkit.plugin.Plugin plugin = getServer().getPluginManager().getPlugin("Vault");
    return !((plugin == null) || (!(this.getConfig().getBoolean("economy.enable", true))));
}