public static java.lang.String listPositionWorldInventory(Adventure.World world, Adventure.Player player) {
    return world.getPositionInventory(player.getPos()).list();
}