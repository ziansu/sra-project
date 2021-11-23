public static mud.Direction resolve(java.lang.String input) {
    mud.Direction result;
    switch (input.toLowerCase()) {
        case "up" :
        case "north" :
            result = mud.Direction.NORTH;
            break;
        case "down" :
        case "south" :
            result = mud.Direction.SOUTH;
            break;
        case "right" :
        case "east" :
            result = mud.Direction.EAST;
            break;
        case "left" :
        case "west" :
            result = mud.Direction.WEST;
            break;
        default :
            result = null;
            break;
    }
    return result;
}