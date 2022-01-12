public void move(double dx, double dy) {
    double x = getX();
    double y = getY();
    x = x + dx;
    y = y + dy;
    if ((x > (DEFAULT_VALUE)) && (y > (DEFAULT_VALUE))) {
        _alpha = calcAlpha(x, y);
        _radius = calcRadius(x, y);
    }
}