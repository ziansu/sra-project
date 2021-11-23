@java.lang.Override
public boolean hitEntity(net.minecraft.item.ItemStack stack, net.minecraft.entity.EntityLivingBase source, net.minecraft.entity.EntityLivingBase target) {
    if (target.isSneaking()) {
        source.rotationYawHead = ((source.rotationYawHead) + 180) % 360.0F;
    }else {
        source.rotationYaw = ((source.rotationYaw) + 180) % 360.0F;
    }
    return true;
}