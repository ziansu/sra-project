@cpw.mods.fml.common.eventhandler.SubscribeEvent
public void renderPlayerTickPost(net.minecraftforge.client.event.RenderPlayerEvent.Post event) {
    if ((event.entity) != null) {
        if ((event.entity) instanceof net.minecraft.client.entity.AbstractClientPlayer) {
            org.avp.entities.extended.ExtendedEntityPlayer extendedPlayer = ((org.avp.entities.extended.ExtendedEntityPlayer) (event.entity.getExtendedProperties(ExtendedEntityPlayer.IDENTIFIER)));
            if (((extendedPlayer != null) && ((extendedPlayer.getPlayer()) != null)) && ((extendedPlayer.getPlayer().ridingEntity) instanceof org.avp.entities.EntityMedpod)) {
                event.setCanceled(true);
            }
        }
    }
}