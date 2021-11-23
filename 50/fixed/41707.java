@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void updates(net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent event) {
    com.himself12794.powersapi.storage.PropertiesManager.runUpdates(event.entityLiving);
}