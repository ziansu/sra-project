<T> T getData(java.lang.String path) {
    java.lang.Object data = this.plugin.getConfig().get(path);
    if (data instanceof java.lang.String) {
        data = org.bukkit.ChatColor.translateAlternateColorCodes('&', ((java.lang.String) (data)));
    }
    return ((T) (data));
}