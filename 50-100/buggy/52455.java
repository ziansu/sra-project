public static mud.Direction resolve(java.lang.String input) {
    switch (input.toLowerCase()) {
        case "up" :
        case "north" :
            return mud.Direction.NORTH;
        case "down" :
        case "south" :
            return mud.Direction.SOUTH;
        case "right" :
        case "east" :
            return mud.Direction.EAST;
        case "left" :
        case "west" :
            return mud.Direction.WEST;
        default :
            return null;
    }
}