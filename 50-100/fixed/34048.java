public boolean isInside(float x, float y) {
    return (((x > (one.getX())) && (x < (two.getX()))) && (y > (one.getY()))) && (y < (two.getY()));
}