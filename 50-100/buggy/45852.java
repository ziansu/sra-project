private boolean isMoveAllowed(GameEngine.Directions direction) {
    switch (direction) {
        case RIGHT :
            return (voidTilePosition.getX()) != ((size) - 1);
        case LEFT :
            return (voidTilePosition.getX()) != 0;
        case UP :
            return (voidTilePosition.getY()) != 0;
        case DOWN :
            return (voidTilePosition.getY()) != ((size) - 1);
        default :
            throw new java.lang.IllegalArgumentException();
    }
}