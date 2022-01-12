@cpw.mods.fml.common.eventhandler.SubscribeEvent(priority = cpw.mods.fml.common.eventhandler.EventPriority.NORMAL)
public void onEntityConstructing(net.minecraftforge.event.entity.EntityEvent.EntityConstructing event) {
    if (((event.entity) instanceof net.minecraft.entity.player.EntityPlayer) && ((com.thedarkera.ztesting.ExtendedPlayer.get(((net.minecraft.entity.player.EntityPlayer) (event.entity)))) == null))
        event.entity.registerExtendedProperties(ExtendedPlayer.identifier, new com.thedarkera.ztesting.ExtendedPlayer(((net.minecraft.entity.player.EntityPlayer) (event.entity))));
    
    event.entity.registerExtendedProperties(ExtendedPlayerAchievements.identifier, new com.thedarkera.ztesting.ExtendedPlayerAchievements(((net.minecraft.entity.player.EntityPlayer) (event.entity))));
}