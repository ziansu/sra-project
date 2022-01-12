<T> T getData(java.lang.String path) {
    if ((this.plugin) == null)
        return null;
    
    java.lang.Object data = this.plugin.getConfig().get(path);
    if (data instanceof java.lang.String) {
        data = org.bukkit.ChatColor.translateAlternateColorCodes('&', ((java.lang.String) (data)));
    }
    return ((T) (data));
}