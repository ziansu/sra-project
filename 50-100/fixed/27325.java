public static org.bitbucket.ucchy.undine.bridge.VaultEcoBridge load(org.bukkit.plugin.Plugin plugin) {
    if (plugin == null)
        return null;
    
    org.bukkit.plugin.RegisteredServiceProvider<net.milkbowl.vault.economy.Economy> economyProvider = org.bukkit.Bukkit.getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
    if (economyProvider != null) {
        org.bitbucket.ucchy.undine.bridge.VaultEcoBridge bridge = new org.bitbucket.ucchy.undine.bridge.VaultEcoBridge();
        bridge.eco = economyProvider.getProvider();
        return bridge;
    }
    return null;
}