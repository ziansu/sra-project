@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public static void preventDrops(net.minecraftforge.event.entity.living.LivingDropsEvent event) {
    if ((event.getEntityLiving()) instanceof net.minecraft.entity.EntityLiving) {
        net.minecraft.entity.EntityLiving entity = ((net.minecraft.entity.EntityLiving) (event.getEntityLiving()));
        net.minecraft.nbt.NBTTagCompound nbt = entity.getEntityData();
        if ((nbt.getByte(Main.KEY_UNDYING)) == ((byte) (1))) {
            event.setCanceled(true);
        }
    }
}