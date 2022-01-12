public static boolean exempt(java.lang.String name) {
    for (java.lang.String ex : org.bukkit.Bukkit.getPluginManager().getPlugin("Reloader").getConfig().getStringList("exempt")) {
        if (ex.toLowerCase().startsWith(name.toLowerCase())) {
            return true;
        }
    }
    return false;
}