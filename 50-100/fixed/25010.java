private void setupVault() {
    org.bukkit.plugin.RegisteredServiceProvider<net.milkbowl.vault.permission.Permission> permProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
    if (permProvider != null) {
        perm = permProvider.getProvider();
    }
    org.bukkit.plugin.RegisteredServiceProvider<net.milkbowl.vault.economy.Economy> econProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
    if (econProvider != null) {
        econ = econProvider.getProvider();
    }
}