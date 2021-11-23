@java.lang.Override
public void teleportToServer(java.lang.String player, java.lang.String serverName) {
    java.io.ByteArrayOutputStream b = new java.io.ByteArrayOutputStream();
    java.io.DataOutputStream out = new java.io.DataOutputStream(b);
    try {
        out.writeUTF("Connect");
        out.writeUTF(serverName);
    } catch (java.io.IOException eee) {
        org.bukkit.Bukkit.getLogger().info("You'll never see me!");
    }
    org.bukkit.Bukkit.getPlayer(player).sendPluginMessage(bukkitPlugin, "BungeeCord", b.toByteArray());
}