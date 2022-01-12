public space.ship.Loc getLocAt(int mX, int mY) {
    int x = ((mX - (offset.x)) - (origin.y)) / (pixsToGrid);
    int y = ((mY - (offset.y)) - (origin.y)) / (pixsToGrid);
    if (space.ship.Loc.isValid(x, y))
        return space.ship.Loc.make(x, y);
    
    return null;
}