@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void entityRenderEventPost(net.minecraftforge.client.event.RenderLivingEvent.Post event) {
    if ((((event.entity) != null) && ((event.entity.ridingEntity) instanceof org.avp.entities.EntityMedpod)) && (!((event.entity) instanceof net.minecraft.entity.player.EntityPlayer))) {
        event.setCanceled(true);
    }
}