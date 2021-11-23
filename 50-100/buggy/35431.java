@java.lang.Override
public void sendPacket(net.md_5.bungee.protocol.DefinedPacket packet) {
    if (packet instanceof net.md_5.bungee.protocol.packet.Chat) {
        me.shawlaf.bungeesecurity.event.MessageSentToPlayerEvent e = net.md_5.bungee.api.ProxyServer.getInstance().getPluginManager().callEvent(new me.shawlaf.bungeesecurity.event.MessageSentToPlayerEvent(player, ((net.md_5.bungee.protocol.packet.Chat) (packet)).getMessage(), me.shawlaf.bungeesecurity.event.MessageSentToPlayerEvent.MessageSender.PROXY));
        if (!(e.isCancelled())) {
            ch.getObject().write(packet);
        }
    }
}