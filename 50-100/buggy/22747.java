public static void sell(org.bukkit.entity.Player admin, java.lang.String owner) {
    if ((com.codisimus.plugins.chunkown.Econ.economy) != null)
        com.codisimus.plugins.chunkown.Econ.economy.depositPlayer(owner, com.codisimus.plugins.chunkown.Econ.sellPrice);
    
    org.bukkit.entity.Player seller = ChunkOwn.server.getPlayer(owner);
    if (seller != null)
        seller.sendMessage(com.codisimus.plugins.chunkown.Econ.adminSoldMsg.replaceAll("<price>", com.codisimus.plugins.chunkown.Econ.economy.format(com.codisimus.plugins.chunkown.Econ.sellPrice)));
    
    admin.sendMessage(com.codisimus.plugins.chunkown.Econ.adminSellMsg.replaceAll("<price>", com.codisimus.plugins.chunkown.Econ.economy.format(com.codisimus.plugins.chunkown.Econ.sellPrice)));
}