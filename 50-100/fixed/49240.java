public void removeEntity(long uuid) {
    if (isServer) {
        projectmp.common.packet.PacketRemoveEntity packet = projectmp.common.packet.repository.PacketRepository.instance().removeEntity;
        packet.uuid = uuid;
        main.server.sendToAllTCP(packet);
        entities.removeValue(getEntityByUUID(uuid), true);
    }else {
        projectmp.common.entity.Entity e = getEntityByUUID(uuid);
        if (e == null)
            return ;
        
        entities.removeValue(e, true);
    }
}