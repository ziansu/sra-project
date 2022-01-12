public boolean move(int dx, int dy, int color) {
    int newX = x;
    int newY = y;
    newX += (dx * (-1)) * color;
    newY += dy * color;
    if (((newX >= 0) && (newX < 5)) && ((newY >= 0) && (newY < 5))) {
        setPair(newX, newY);
        return true;
    }
    return false;
}