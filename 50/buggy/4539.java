public static int getYawOffset(org.bukkit.block.BlockFace face) {
    switch (face) {
        case SOUTH :
            return 180;
        case WEST :
            return 90;
        case NORTH :
            return 0;
        case EAST :
            return 270;
    }
    return 0;
}