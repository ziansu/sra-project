public com.codeforces.commons.geometry.Vector2D rotate(double angle) {
    double cos = cos(angle);
    double sin = sin(angle);
    double x = getX();
    double y = getY();
    setX(((x * cos) - (y * sin)));
    setY(((x * sin) + (y * cos)));
    return this;
}