public MapPosition getPosition(DIR direction) {
    switch (direction) {
        case NORTH :
            return new MapPosition(x, ((y) - 1));
        case SOUTH :
            return new MapPosition(x, ((y) + 1));
        case EAST :
            return new MapPosition(((x) + 1), y);
        case WEST :
            return new MapPosition(((x) - 1), y);
        default :
            return null;
    }
}