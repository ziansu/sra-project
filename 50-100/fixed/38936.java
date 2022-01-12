public boolean withinDistance(float tx, float ty) {
    float dx = tx - (x);
    float dy = ty - (y);
    return (java.lang.Math.sqrt(((dx * dx) + (dy * dy)))) <= 20;
}