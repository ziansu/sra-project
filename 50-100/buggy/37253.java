public void handleRemoval(net.minecraft.entity.EntityLivingBase entity) {
    if (entity.worldObj.isRemote)
        return ;
    
    int entityId = entity.getEntityId();
    boolean needsUpdate = false;
    if (!(removeClientQueue.contains(entityId))) {
        removeClientQueue.add(entityId);
        needsUpdate = true;
    }
    if (achromaticEntities.contains(entityId)) {
        achromaticEntities.remove(entityId);
        needsUpdate = true;
    }
    if (needsUpdate) {
        markDirty();
    }
}