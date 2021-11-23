public void update(game.level.LevelMap map, double timeFactor) {
    x += (xMovement) * timeFactor;
    y += (yMovement) * timeFactor;
    super.update(map, timeFactor);
}