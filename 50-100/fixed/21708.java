@java.lang.Override
public net.minecraft.item.ItemStack onItemRightClick(net.minecraft.item.ItemStack itemstack, net.minecraft.world.World worldObj, net.minecraft.entity.player.EntityPlayer entityPlayer) {
    if (this.canThrowFlame(worldObj, entityPlayer)) {
        if (!(worldObj.isRemote)) {
            org.avp.entities.EntityFlame entity = new org.avp.entities.EntityFlame(worldObj, entityPlayer);
            entity.setLocationAndAngles(entity.posX, ((entity.posY) - 0.35), entity.posZ, entity.rotationYaw, entity.rotationPitch);
            worldObj.spawnEntityInWorld(entity);
        }
        Sounds.SOUND_WEAPON_FLAMETHROWER.playSound(entityPlayer);
    }
    return itemstack;
}