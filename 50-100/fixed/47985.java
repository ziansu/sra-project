public boolean setupEconomy() {
    if ((getServer().getPluginManager().getPlugin("Vault")) == null)
        return false;
    
    org.bukkit.plugin.RegisteredServiceProvider rsp = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
    if (rsp == null)
        return false;
    
    com.gabezter4.Vitals.Vitals.econ = ((net.milkbowl.vault.economy.Economy) (rsp.getProvider()));
    return (com.gabezter4.Vitals.Vitals.econ) != null;
}