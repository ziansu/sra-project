private boolean isOverlyInactive(org.bukkit.OfflinePlayer op) {
    return ((getInactivityTime(op)) / 86400000) > (ILConfigHandler.config.getLong("daysOfInactivity"));
}