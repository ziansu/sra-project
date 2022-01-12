@java.lang.Override
public void kick(java.lang.String message) throws java.lang.reflect.InvocationTargetException {
    com.comphenix.protocol.ProtocolManager protocolManager = com.comphenix.protocol.ProtocolLibrary.getProtocolManager();
    com.comphenix.protocol.events.PacketContainer kickPacket = protocolManager.createPacket(com.comphenix.protocol.PacketType.Login.Server.DISCONNECT);
    kickPacket.getChatComponents().write(0, com.comphenix.protocol.wrappers.WrappedChatComponent.fromText(message));
    try {
        protocolManager.sendServerPacket(player, kickPacket);
    } finally {
        player.kickPlayer("Disconnect");
    }
}