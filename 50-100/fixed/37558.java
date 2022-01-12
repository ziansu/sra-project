public static boolean buy(org.bukkit.entity.Player player) {
    java.lang.String name = player.getName();
    if ((com.codisimus.plugins.chunkown.Econ.economy) != null) {
        if (!(com.codisimus.plugins.chunkown.Econ.economy.has(name, com.codisimus.plugins.chunkown.Econ.buyPrice))) {
            player.sendMessage(com.codisimus.plugins.chunkown.Econ.insufficientFundsMsg.replace("<price>", com.codisimus.plugins.chunkown.Econ.economy.format(com.codisimus.plugins.chunkown.Econ.buyPrice)));
            return false;
        }
        com.codisimus.plugins.chunkown.Econ.economy.withdrawPlayer(name, com.codisimus.plugins.chunkown.Econ.buyPrice);
    }
    player.sendMessage(com.codisimus.plugins.chunkown.Econ.buyMsg.replace("<price>", com.codisimus.plugins.chunkown.Econ.economy.format(com.codisimus.plugins.chunkown.Econ.buyPrice)));
    return true;
}