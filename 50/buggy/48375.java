@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void registerExtendedPropperties(net.minecraftforge.event.entity.EntityEvent.EntityConstructing event) {
    if ((event.entity) instanceof net.minecraft.entity.EntityLivingBase) {
        com.himself12794.powersapi.storage.PropertiesManager.instance().registerPropertiesForEntity(((net.minecraft.entity.EntityLivingBase) (event.entity)));
    }
}