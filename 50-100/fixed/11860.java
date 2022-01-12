@java.lang.Override
public void joinServer(java.net.InetSocketAddress server) {
    java.lang.String host = server.getHostString();
    int port = server.getPort();
    net.minecraft.client.multiplayer.ServerData serverData = new net.minecraft.client.multiplayer.ServerData("Sponge API Call", ((host + ":") + port), false);
    net.minecraftforge.fml.client.FMLClientHandler.instance().connectToServer(this.currentScreen, serverData);
}