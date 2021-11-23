public boolean withinDistance(float tx, float ty) {
    float dx = tx - ((x) + 16);
    float dy = ty - ((y) + 16);
    return (java.lang.Math.sqrt(((dx * dx) + (dy * dy)))) <= 20;
}