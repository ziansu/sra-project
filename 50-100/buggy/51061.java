public com.codeforces.commons.geometry.Vector2D rotate(double angle) {
    double cos = cos(angle);
    double sin = sin(angle);
    setX((((getX()) * cos) - ((getY()) * sin)));
    setY((((getX()) * sin) + ((getY()) * cos)));
    return this;
}