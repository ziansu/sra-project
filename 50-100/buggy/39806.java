private void loadValues(org.bukkit.configuration.file.FileConfiguration file) {
    me.synapz.warnings.SettingsManager.broadcast = file.getBoolean("broadcast-reason");
    me.synapz.warnings.SettingsManager.BROADCAST_MESSAGE = transColors(file.getString("broadcast-message"));
    me.synapz.warnings.SettingsManager.PREFIX = transColors(file.getString("prefix"));
    me.synapz.warnings.SettingsManager.DEFAULT_REASON = transColors(file.getString("default-reason"));
    me.synapz.warnings.SettingsManager.PLAYER_MESSAGE = transColors(file.getString("player-message"));
}