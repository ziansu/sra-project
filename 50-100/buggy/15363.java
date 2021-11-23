public space.ship.Loc getLocAt(java.awt.Point point) {
    int x = (((point.x) - (offset.x)) - (origin.y)) / (pixsToGrid);
    int y = (((point.y) - (offset.y)) - (origin.y)) / (pixsToGrid);
    if (space.ship.Loc.isValid(x, y))
        return space.ship.Loc.make(x, y);
    
    return null;
}