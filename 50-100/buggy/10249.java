@net.minecraftforge.fml.common.eventhandler.SubscribeEvent
public void onJoin(net.minecraftforge.fml.common.network.FMLNetworkEvent.ClientConnectedToServerEvent event) {
    boolean singleplayer = net.minecraft.client.Minecraft.getMinecraft().isSingleplayer();
    if (!singleplayer) {
        java.lang.String ip = net.minecraft.client.Minecraft.getMinecraft().getCurrentServerData().serverIP;
        if (ip.contains(".hypixel.net")) {
            QuickPlay.onHypixel = true;
            java.lang.System.out.println("Currently on Hypixel!");
        }
    }
}