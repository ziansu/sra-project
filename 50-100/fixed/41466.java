@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onEntityUpdate(net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent event) {
    if ((event.entityLiving) == null) {
        return ;
    }
    if ((event.entityLiving) instanceof net.minecraft.entity.player.EntityPlayer) {
        com.lothrazar.samsmagic.SpellGhost.onPlayerUpdate(event);
        com.lothrazar.samsmagic.SpellRegistry.tickSpellTimer(((net.minecraft.entity.player.EntityPlayer) (event.entityLiving)));
    }
    com.lothrazar.samsmagic.PotionRegistry.tickSlowfall(event);
    com.lothrazar.samsmagic.PotionRegistry.tickWaterwalk(event);
}