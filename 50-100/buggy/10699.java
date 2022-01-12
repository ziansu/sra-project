private boolean pntInCircle(double px, double py, double x1, double y1, double radius) {
    double diffX = x1 - px;
    double diffY = y1 - py;
    double dist = (diffX * diffX) + (diffY * diffY);
    if (dist < (radius * radius)) {
        return true;
    }else {
        return false;
    }
}