public void move(int x, int y) {
    xPos += vx;
    yPos += vy;
    Point.multiMove(vx, vy, north, east, south, west);
}