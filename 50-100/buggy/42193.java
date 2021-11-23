public static org.bukkit.block.BlockFace toBukkit(int nukkit) {
    switch (nukkit) {
        case cn.nukkit.math.Vector3.SIDE_DOWN :
            return org.bukkit.block.BlockFace.DOWN;
        case cn.nukkit.math.Vector3.SIDE_UP :
            return org.bukkit.block.BlockFace.UP;
        case cn.nukkit.math.Vector3.SIDE_WEST :
            return org.bukkit.block.BlockFace.WEST;
        case cn.nukkit.math.Vector3.SIDE_EAST :
            return org.bukkit.block.BlockFace.EAST;
        case cn.nukkit.math.Vector3.SIDE_NORTH :
            return org.bukkit.block.BlockFace.NORTH;
        case cn.nukkit.math.Vector3.SIDE_SOUTH :
            return org.bukkit.block.BlockFace.SOUTH;
        case 255 :
            return org.bukkit.block.BlockFace.SELF;
    }
    throw new java.lang.IllegalArgumentException(("Unknown Vector3.SIDE: " + nukkit));
}