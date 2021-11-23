public void placestructure(Game.Levels.Structure a) {
    int x = ((int) ((java.lang.Math.random()) * ((width) - (a.getSize()))));
    int y = ((int) ((java.lang.Math.random()) * ((height) - (a.getSize()))));
    placestructure(a, x, y);
}