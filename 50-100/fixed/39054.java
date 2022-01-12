protected void tryDeliverNotifications() {
    net.minecraft.server.management.ServerConfigurationManager manager = net.minecraft.server.MinecraftServer.getServer().getConfigurationManager();
    if (manager == null)
        return ;
    
    boolean delivered = false;
    java.util.List<net.minecraft.entity.player.EntityPlayer> players = manager.playerEntityList;
    for (net.minecraft.entity.player.EntityPlayer player : players) {
        if (manager.func_152596_g(player.getGameProfile())) {
            deliverNotificationsToPlayer(player);
            delivered = true;
        }
    }
    if (delivered)
        clearNotifications();
    
}