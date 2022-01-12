public net.minecraft.entity.player.EntityPlayerMP getPlayerOfThis() {
    if ((net.minecraft.server.MinecraftServer.getServer().getConfigurationManager().playerEntityList) == null)
        return null;
    
    for (net.minecraft.entity.player.EntityPlayerMP p : ((java.util.List<net.minecraft.entity.player.EntityPlayerMP>) (net.minecraft.server.MinecraftServer.getServer().getConfigurationManager().playerEntityList)))
        if (p.getGameProfile().getId().equals(this.getUuid()))
            return p;
        
    
    return null;
}