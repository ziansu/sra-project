public void move(double dx, double dy) {
    double x = getX();
    double y = getY();
    x = x + dx;
    y = y + dy;
    y = (y < (DEFAULT_VALUE)) ? getY() : y;
    x = (x < (DEFAULT_VALUE)) ? getX() : x;
    _alpha = calcAlpha(x, y);
    _radius = calcRadius(x, y);
}