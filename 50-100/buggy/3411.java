public newGame.IntPoint randomLoc(newGame.Mapping.Tile oftype) {
    final int maxAttempts = 1024;
    int attempts = 0;
    int rx;
    int ry;
    newGame.Mapping.Tile t;
    do {
        rx = MainGame.random.nextInt(getWidth());
        ry = MainGame.random.nextInt(getHeight());
        t = getElement(rx, ry);
        attempts++;
    } while ((!(t.equalsTo(oftype))) && (attempts <= maxAttempts) );
    return new newGame.IntPoint(rx, ry);
}