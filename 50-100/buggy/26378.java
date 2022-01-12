@java.lang.Override
public void onWornTick(net.minecraft.item.ItemStack item, net.minecraft.entity.EntityLivingBase entity) {
    if (entity instanceof net.minecraft.entity.player.EntityPlayerMP) {
        net.minecraft.entity.player.EntityPlayerMP player = ((net.minecraft.entity.player.EntityPlayerMP) (entity));
        if (player.isSneaking()) {
            (ticksSnuck)++;
            if ((ticksSnuck) >= 50) {
                player.worldObj.spawnEntityInWorld(new nimble.Java.TheVoid.Entities.Clone(player.worldObj));
            }
        }
    }
}