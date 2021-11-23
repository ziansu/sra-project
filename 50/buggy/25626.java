public static void sell(org.bukkit.entity.Player player) {
    if ((com.codisimus.plugins.chunkown.Econ.economy) != null)
        com.codisimus.plugins.chunkown.Econ.economy.depositPlayer(player.getName(), com.codisimus.plugins.chunkown.Econ.sellPrice);
    
    player.sendMessage(com.codisimus.plugins.chunkown.Econ.sellMsg.replaceAll("<price>", com.codisimus.plugins.chunkown.Econ.economy.format(com.codisimus.plugins.chunkown.Econ.sellPrice)));
}