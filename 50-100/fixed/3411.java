public newGame.IntPoint randomLoc(newGame.Mapping.Tile oftype) {
    int rx;
    int ry;
    newGame.Mapping.Tile t;
    do {
        rx = MainGame.random.nextInt(getWidth());
        ry = MainGame.random.nextInt(getHeight());
        t = getElement(rx, ry);
    } while (!(t.equalsTo(oftype)) );
    return new newGame.IntPoint(rx, ry);
}