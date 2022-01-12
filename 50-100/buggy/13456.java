void drawRange(int range) {
    int centerX = ((int) (getCenter().x()));
    int centerY = ((int) (getCenter().y()));
    gametools.Game.painter().drawOval((centerX - (range / 2)), (centerY - (range / 2)), range, range);
}