public boolean move(Board.Tile t) {
    int tempX = t.getX();
    int tempY = t.getY();
    if (checkRoute(tempX, tempY)) {
        this.x = t.getX();
        this.y = t.getY();
        return true;
    }
    return false;
}