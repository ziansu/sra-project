private void sentEncryptionRequest() throws java.lang.reflect.InvocationTargetException {
    com.comphenix.protocol.events.PacketContainer newPacket = new com.comphenix.protocol.events.PacketContainer(com.comphenix.protocol.PacketType.Login.Server.ENCRYPTION_BEGIN);
    newPacket.getStrings().write(0, serverId);
    java.security.PublicKey publicKey = plugin.getServerKey().getPublic();
    newPacket.getSpecificModifier(java.security.PublicKey.class).write(0, publicKey);
    newPacket.getByteArrays().write(0, verifyToken);
    com.comphenix.protocol.ProtocolLibrary.getProtocolManager().sendServerPacket(player, newPacket);
}