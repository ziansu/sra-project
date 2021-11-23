@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onPlayerTick(net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent event) {
    net.minecraft.entity.player.EntityPlayer player = event.player;
    net.minecraft.item.ItemStack held = player.getCurrentEquippedItem();
    if ((player.isPotionActive(PotionRegistry.ender)) && ((player.posY) < (-50))) {
        com.lothrazar.samscontent.SamsUtilities.teleportWallSafe(player, player.worldObj, player.getPosition().up(256));
    }
}