public boolean hasVault() {
    org.bukkit.plugin.Plugin plugin = getServer().getPluginManager().getPlugin("Vault");
    return !(((plugin == null) || (!(plugin instanceof net.milkbowl.vault.Vault))) || (!(this.getConfig().getBoolean("economy.enable", true))));
}