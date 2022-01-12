public static int getYawOffset(org.bukkit.block.BlockFace face) {
    switch (face) {
        case SOUTH :
            return 180;
        case NORTH :
            return 0;
        case WEST :
        case EAST :
            return 90;
    }
    return 0;
}