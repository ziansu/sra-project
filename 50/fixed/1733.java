public int countAirBlocksAround(org.bukkit.entity.Player player, int limit) {
    return airBlocksAround(player.getLocation(), player.getLocation(), limit, new java.util.ArrayList<org.bukkit.block.Block>());
}