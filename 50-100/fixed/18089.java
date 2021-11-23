@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void entityRenderEventPre(net.minecraftforge.client.event.RenderLivingEvent.Pre event) {
    if (((event.entity) != null) && ((event.entity.ridingEntity) instanceof org.avp.entities.EntityMedpod)) {
        event.setCanceled(true);
        renderLiving.render(event.entity, event.renderer, event.x, event.y, event.z, com.arisux.amdxlib.lib.game.Game.partialTicks());
    }
}