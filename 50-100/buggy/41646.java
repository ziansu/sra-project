private boolean wallAhead() {
    switch (h) {
        case NORTH :
            return allowedPos(x, ((y) - 1));
        case EAST :
            return allowedPos(((x) + 1), y);
        case SOUTH :
            return allowedPos(x, ((y) + 1));
        case WEST :
            return allowedPos(((x) - 1), y);
    }
}