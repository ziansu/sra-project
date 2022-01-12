public boolean initEconomy() {
    org.bukkit.plugin.RegisteredServiceProvider<net.milkbowl.vault.economy.Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
    if (economyProvider != null) {
        me.ellbristow.ATMsigns.ATMsigns.economy = economyProvider.getProvider();
        return true;
    }
    return false;
}