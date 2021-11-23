public boolean canPickup(geom.Part p) {
    if (p == null) {
        return false;
    }
    java.util.ArrayList<robot.BoundingBox> curEEOBBs = eeOBBsMap.get(activeEndEffector);
    for (robot.BoundingBox b : curEEOBBs) {
        if (p.collision(b)) {
            return false;
        }
    }
    curEEOBBs = eePickupOBBs.get(activeEndEffector);
    for (robot.BoundingBox b : curEEOBBs) {
        if (p.collision(b)) {
            return true;
        }
    }
    return false;
}