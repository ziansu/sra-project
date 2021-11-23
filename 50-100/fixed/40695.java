public java.util.List<java.lang.String> getPlayers(boolean inWorld) {
    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    if (inWorld) {
        for (net.minecraft.entity.player.EntityPlayer player : ((java.lang.Iterable<net.minecraft.entity.player.EntityPlayer>) (world.playerEntities)))
            list.add(player.getDisplayName());
        
    }else {
        for (java.lang.String player : net.minecraft.server.MinecraftServer.getServer().getAllUsernames())
            list.add(player);
        
    }
    return list;
}