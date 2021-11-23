static double calculateAngle(int x, int y) {
    double cos = x - 400;
    double sin = 300 - y;
    double angle = (((java.lang.Math.atan2(cos, sin)) * 360) / 3.14159265) / 2;
    if (angle < 0) {
        return 360 + angle;
    }else {
        return angle;
    }
}