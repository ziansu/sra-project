@java.lang.Override
public void onEnable() {
    US.bittiez.SignRanks.main.log = getLogger();
    vaultOnEnable();
    if (permissionOnEnable()) {
        loadConfig();
        signData = US.bittiez.SignRanks.SignUtils.loadSignDataInto(getDataFolder(), SignEventListener.signDataConfigFile);
        signEventListener = new US.bittiez.SignRanks.SignEventListener(this, signData, US.bittiez.SignRanks.main.economy, US.bittiez.SignRanks.main.permission, US.bittiez.SignRanks.main.log);
        getServer().getPluginManager().registerEvents(signEventListener, this);
    }else {
        US.bittiez.SignRanks.main.log.warning("SignRanks has been disabled. Could not find a permissions plugin.");
        this.setEnabled(false);
    }
}