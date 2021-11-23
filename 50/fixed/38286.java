private java.lang.String getImage() {
    switch (orientation) {
        case com.concordia.mcga.utilities.pathfinding.IndoorDirections.NORTH_ORIENTATION :
            return "up";
        case com.concordia.mcga.utilities.pathfinding.IndoorDirections.SOUTH_ORIENTATION :
            return "down";
        case com.concordia.mcga.utilities.pathfinding.IndoorDirections.EAST_ORIENTATION :
            return "right";
        case com.concordia.mcga.utilities.pathfinding.IndoorDirections.WEST_ORIENTATION :
            return "left";
        default :
            break;
    }
    return null;
}