public com.bergerkiller.bukkit.common.protocol.CommonPacket getLocationPacket(int posX, int posY, int posZ, int yaw, int pitch) {
    return PacketType.OUT_ENTITY_TELEPORT.newInstance(entity.getEntityId(), posX, posY, posZ, ((byte) (yaw)), ((byte) (pitch)), false);
}