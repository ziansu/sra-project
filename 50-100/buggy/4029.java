private static org.bukkit.block.BlockFace blockFaceFromYaw(float yaw) {
    yaw = yaw % 360;
    if (yaw < 0) {
        yaw += 360.0;
    }
    java.lang.System.out.println(yaw);
    if ((yaw < 45) || (yaw >= 315)) {
        return org.bukkit.block.BlockFace.EAST;
    }else
        if ((45 <= yaw) && (yaw < 135)) {
            return org.bukkit.block.BlockFace.SOUTH;
        }else
            if ((135 <= yaw) && (yaw < 225)) {
                return org.bukkit.block.BlockFace.WEST;
            }else {
                return org.bukkit.block.BlockFace.NORTH;
            }
        
    
}