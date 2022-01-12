@net.minecraftforge.fml.common.eventhandler.SubscribeEvent(priority = net.minecraftforge.fml.common.eventhandler.EventPriority.HIGH)
public void onPlayerPickupItem(br.com.gamemods.minecity.forge.mc_1_10_2.protection.vanilla.EntityItemPickupEvent event) {
    if (event.getEntity().worldObj.isRemote)
        return ;
    
    if (onPlayerPickupItem(((br.com.gamemods.minecity.forge.base.accessors.entity.base.IEntityPlayerMP) (event.getEntityPlayer())), ((br.com.gamemods.minecity.forge.base.accessors.entity.item.IEntityItem) (event.getItem())), false)) {
        event.setCanceled(true);
    }
}