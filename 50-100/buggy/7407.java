public void sendLoggedIn(org.bukkit.plugin.Plugin plugin, org.bukkit.entity.Player p) {
    com.mengcraft.account.bungee.BungeeMessage message = new com.mengcraft.account.bungee.BungeeMessage();
    message.setType(BungeeMain.DISTRIBUTE);
    message.setName(p.getName());
    message.setIp(p.getAddress().getAddress().getHostAddress());
    map.put(message.getName(), message.getIp());
    p.sendPluginMessage(plugin, com.mengcraft.account.bungee.BungeeMain.CHANNEL, message.toByteArray());
}