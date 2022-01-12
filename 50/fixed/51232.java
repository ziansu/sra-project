public void onEnable() {
    tdiant.bukkit.chestpassword.ChestPassword.plugin = this;
    checkVersion();
    if (tdiant.bukkit.chestpassword.ChestPassword.DISABLE_TAG)
        return ;
    
    tdiant.bukkit.chestpassword.manager.ConfigManager.reloadConfig();
    setSqlite(true);
    registerListener();
}