public MapPosition getPosition(DIR direction) {
    switch (direction) {
        case NORTH :
            return new MapPosition(x, ((y)--));
        case SOUTH :
            return new MapPosition(x, ((y)++));
        case EAST :
            return new MapPosition(((x)++), y);
        case WEST :
            return new MapPosition(((x)--), y);
        default :
            return null;
    }
}