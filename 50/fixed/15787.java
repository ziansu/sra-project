public static void tickLavawalk(net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent event) {
    if (event.entityLiving.isPotionActive(com.lothrazar.samsmagic.potion.PotionRegistry.lavawalk)) {
        com.lothrazar.samsmagic.potion.PotionRegistry.tickLiquidWalk(event, Blocks.lava);
    }
}