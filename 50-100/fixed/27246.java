public void sync() {
    com.soundbody.network.PacketGeneralClient msg = new com.soundbody.network.PacketGeneralClient(0);
    msg.setInt(fitness);
    SoundBody.simpleChannel.sendTo(msg, net.minecraft.server.MinecraftServer.getServer().getConfigurationManager().getPlayerByUUID(player.getUniqueID()));
    for (com.soundbody.lib.EnumAttribute attribute : com.soundbody.lib.EnumAttribute.values())
        attribute.resetAttribute(player, this);
    
}