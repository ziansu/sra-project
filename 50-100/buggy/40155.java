public void loadData() {
    me.bman7842.dailyquest.main.ConfigManager.load(this, "config.yml");
    org.bukkit.configuration.file.FileConfiguration config = me.bman7842.dailyquest.main.ConfigManager.get("config.yml");
    try {
        data.setQuestWaitTime(config.getInt("quest_update_time_hours"));
        me.bman7842.dailyquest.main.Messages.setErrorMessageFormat(config.getString("error_message_format"));
        me.bman7842.dailyquest.main.Messages.setAlertMessageFormat(config.getString("alert_message_format"));
    } catch (java.lang.Exception e) {
        org.bukkit.Bukkit.getLogger().info("Error in config, quest_update_time_hours must be an integer!");
    }
}