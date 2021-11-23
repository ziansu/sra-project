public void readConfig() {
    config = getConfig();
    this.saveDefaultConfig();
    reloadConfig();
    enableChat = config.getBoolean("chat.enable");
    message = config.getString("chat.message");
    patterns = config.getStringList("chat.patternlist");
    replaceChat = config.getBoolean("chat.replace");
    users = config.getStringList("ime.user");
    getLogger().info("readConfig");
    updatePattern();
}