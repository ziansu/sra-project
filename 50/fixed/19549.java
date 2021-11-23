@java.lang.Override
public com.emc.storageos.model.vpool.ObjectVirtualPoolRestRep apply(com.emc.storageos.db.client.model.VirtualPool vpool) {
    return com.emc.storageos.api.mapper.VirtualPoolMapper.toObjectVirtualPool(vpool);
}