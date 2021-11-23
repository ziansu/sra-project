public int pivotSlide(double angle, double speed, boolean condition, double pivotAmount) {
    horizontal = round2D(calculateX(angle, speed));
    vertical = round2D(calculateY(angle, speed));
    if (condition) {
        rawSlide(horizontal, vertical, pivotAmount, speed);
        return 1;
    }else {
        return 0;
    }
}