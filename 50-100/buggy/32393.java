@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onClientTick(net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent event) {
    isServerSide = false;
    net.minecraft.entity.player.EntityPlayer entityPlayer = net.minecraftforge.fml.client.FMLClientHandler.instance().getClientPlayerEntity();
    if (entityPlayer != null) {
        if ((helloTimeout) > 0) {
            (helloTimeout)--;
            if ((helloTimeout) <= 0) {
                entityPlayer.addChatMessage(new net.minecraft.util.ChatComponentText("This server does not have Crafting Tweaks installed. Functionality may be limited."));
                isServerSide = false;
            }
        }
    }
}