@java.lang.SuppressWarnings(value = "incomplete-switch")
public static int getIntCardinalDirection(org.bukkit.util.Vector vector) {
    org.bukkit.block.BlockFace face = com.projectkorra.projectkorra.GeneralMethods.getCardinalDirection(vector);
    switch (face) {
        case SOUTH :
            return 7;
        case SOUTH_WEST :
            return 6;
        case WEST :
            return 3;
        case NORTH_WEST :
            return 0;
        case NORTH :
            return 1;
        case NORTH_EAST :
            return 2;
        case EAST :
            return 5;
        case SOUTH_EAST :
            return 8;
    }
    return 4;
}