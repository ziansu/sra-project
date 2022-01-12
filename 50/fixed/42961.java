public void debug(java.lang.String msg, org.bukkit.entity.Player p) {
    if (((plugin) != null) && (plugin.getConfig().getBoolean("debug", false))) {
        sendMessage(("[Debug]" + msg), p);
    }
}