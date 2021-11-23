private java.lang.String getSuffix(org.bukkit.entity.Player p) {
    if (((getServer().getPluginManager().getPlugin("Vault")) != null) && ((net.citringo.hageplugin.HagePlugin.chat) != null)) {
        return net.citringo.hageplugin.HagePlugin.chat.getPlayerSuffix(p).replaceAll("&([0-9a-fk-r])", "§$1");
    }
    return "";
}