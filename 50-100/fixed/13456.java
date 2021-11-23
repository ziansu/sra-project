void drawRange(int range) {
    int centerX = ((int) (getCenter().x()));
    int centerY = ((int) (getCenter().y()));
    gametools.Game.painter().drawOval((centerX - range), (centerY - range), (range * 2), (range * 2));
}