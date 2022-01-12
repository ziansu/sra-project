@java.lang.Override
public void onEntityRemoved(net.minecraft.entity.Entity entityIn) {
    if ((entityIn instanceof net.minecraft.entity.item.EntityMinecart) && (!(entityIn.worldObj.isRemote))) {
        com.minemaarten.signals.capabilities.CapabilityMinecartDestination cap = entityIn.getCapability(CapabilityMinecartDestination.INSTANCE, null);
        cap.onCartBroken(((net.minecraft.entity.item.EntityMinecart) (entityIn)));
    }
}