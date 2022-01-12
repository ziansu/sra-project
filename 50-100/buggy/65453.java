public boolean contains(int x, int y) {
    return (((x >= (pos.getX())) && (x <= ((pos.getX()) + (getWidth())))) && (y >= (pos.getY()))) && (y <= ((pos.getY()) + (getHeight())));
}