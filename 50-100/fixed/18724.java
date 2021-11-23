private void kickPlayer(java.lang.String reason) {
    com.comphenix.protocol.events.PacketContainer kickPacket = new com.comphenix.protocol.events.PacketContainer(com.comphenix.protocol.PacketType.Login.Server.DISCONNECT);
    kickPacket.getChatComponents().write(0, com.comphenix.protocol.wrappers.WrappedChatComponent.fromText(reason));
    try {
        com.comphenix.protocol.ProtocolLibrary.getProtocolManager().sendServerPacket(player, kickPacket);
        player.kickPlayer("Disconnect");
    } catch (java.lang.reflect.InvocationTargetException ex) {
        plugin.getLog().error("Error sending kick packet", ex);
    }
}