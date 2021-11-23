public boolean sendToServer(org.bukkit.entity.Player player, java.lang.String destination, boolean callEvent) {
    if (!callEvent) {
        com.yahoo.tracebachi.DeltaEssentials.Events.PlayerServerSwitchEvent event = new com.yahoo.tracebachi.DeltaEssentials.Events.PlayerServerSwitchEvent(player, destination);
        org.bukkit.Bukkit.getPluginManager().callEvent(event);
        if (event.isCancelled()) {
            return false;
        }
    }
    com.google.common.io.ByteArrayDataOutput output = com.google.common.io.ByteStreams.newDataOutput();
    output.writeUTF("Connect");
    output.writeUTF(destination);
    player.sendPluginMessage(this, "BungeeCord", output.toByteArray());
    return true;
}