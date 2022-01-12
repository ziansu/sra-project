public com.ariweiland.biophysics.Point getAdjacent(com.ariweiland.biophysics.Point.Direction direction) {
    switch (direction) {
        case EAST :
            return new com.ariweiland.biophysics.Point(((x) + 1), y);
        case NORTH :
            return new com.ariweiland.biophysics.Point(x, ((y) - 1));
        case WEST :
            return new com.ariweiland.biophysics.Point(((x) - 1), y);
        case SOUTH :
        default :
            return new com.ariweiland.biophysics.Point(x, ((y) + 1));
    }
}