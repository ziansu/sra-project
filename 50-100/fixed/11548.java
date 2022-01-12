public int getPower(double speed, int resistance) {
    double power = 0.0;
    if (speed > 0) {
        power = ((3.05 + (4.577 * speed)) + ((0.01798 * speed) * speed)) + (((2.038E-5 * speed) * speed) * speed);
    }
    return ((int) (power));
}