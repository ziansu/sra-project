public ValkyrienWarfareBase.PhysicsManagement.PhysicsWrapperEntity getShipFixedOnto(net.minecraft.entity.Entity entity) {
    return getManagerForWorld(entity.worldObj).getShipFixedOnto(entity, false);
}