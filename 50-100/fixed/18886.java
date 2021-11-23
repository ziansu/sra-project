@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void PlayerTickEvent(net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent event) {
    if ((event.entityLiving) instanceof net.minecraft.entity.player.EntityPlayer) {
        net.minecraft.entity.player.EntityPlayer player = ((net.minecraft.entity.player.EntityPlayer) (event.entityLiving));
        net.minecraft.nbt.NBTTagCompound tag = player.getEntityData();
        int linkCooldown = tag.getInteger("LinkCooldown");
        if (linkCooldown > 0) {
            linkCooldown--;
            tag.setInteger("LinkCooldown", linkCooldown);
        }
    }
}