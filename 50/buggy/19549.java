@java.lang.Override
public com.emc.storageos.model.vpool.ObjectVirtualPoolRestRep apply(com.emc.storageos.db.client.model.VirtualPool vpool) {
    com.emc.storageos.model.vpool.ObjectVirtualPoolRestRep to = com.emc.storageos.api.mapper.VirtualPoolMapper.toObjectVirtualPool(vpool);
    return to;
}