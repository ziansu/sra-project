@java.lang.Override
public void onPluginMessageReceived(java.lang.String channel, org.bukkit.entity.Player player, byte[] message) {
    if (!(channel.equals("BungeeCord"))) {
        com.google.common.io.ByteArrayDataInput in = com.google.common.io.ByteStreams.newDataInput(message);
        java.lang.String subchannel = in.readUTF();
        if (subchannel.equals("GetServer")) {
            m.setServerName(in.readUTF());
        }
    }
}