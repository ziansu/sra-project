public static java.awt.image.BufferedImage getRail(projlab.rail.ui.Direction.Direction aDir, projlab.rail.ui.Direction.Direction bDir) {
    if ((aDir.value) > (bDir.value)) {
        projlab.rail.ui.Direction.Direction temp = aDir;
        aDir = bDir;
        bDir = temp;
    }
    if ((aDir == (WEST)) && (bDir == (EAST))) {
        return projlab.rail.ui.ResourceManager.RAIL_STRAIGHT_HORI;
    }else
        if ((aDir == (NORTH)) && (bDir == (SOUTH))) {
            return projlab.rail.ui.ResourceManager.RAIL_STRAIGHT_VERT;
        }else {
            return projlab.rail.ui.ResourceManager.RAIL_CURVES[aDir.value];
        }
    
}