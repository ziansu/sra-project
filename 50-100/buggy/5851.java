@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onEntityJoinWorld(net.minecraftforge.event.entity.EntityJoinWorldEvent event) {
    if ((event.entity) instanceof net.minecraft.entity.EntityLivingBase) {
        com.himself12794.powersapi.storage.PropertiesManager.instance().runOnJoinWorld(((net.minecraft.entity.EntityLivingBase) (event.entity)), event.world);
        if ((event.entity) instanceof net.minecraft.entity.player.EntityPlayerMP) {
            java.lang.System.out.println("Synchronizing");
            com.himself12794.powersapi.storage.PropertiesManager.instance().syncPlayerToClient(((net.minecraft.entity.player.EntityPlayerMP) (event.entity)));
        }
    }
}