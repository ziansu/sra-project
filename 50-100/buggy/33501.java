private static void tickSlowfall(net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent event) {
    if (event.entityLiving.isPotionActive(com.lothrazar.samsmagic.potion.PotionRegistry.slowfall)) {
        if ((event.entityLiving) instanceof net.minecraft.entity.player.EntityPlayer) {
            net.minecraft.entity.player.EntityPlayer p = ((net.minecraft.entity.player.EntityPlayer) (event.entityLiving));
            if (p.isSneaking()) {
                return ;
            }
        }
        if ((event.entityLiving.motionY) < 0) {
            event.entityLiving.motionY *= ModMain.cfg.slowfallSpeed;
            event.entityLiving.fallDistance = 0.0F;
        }
    }
}