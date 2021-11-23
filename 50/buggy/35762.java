public void increment(double step) {
    angle += step;
    if ((angle) > 360) {
        angle = (angle) - 360;
    }
    if ((angle) < 0) {
        angle = 360 - (angle);
    }
}