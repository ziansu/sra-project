void setAngle(double angle) {
    double angleR = semestralka.ActuallyUsefulLine.deg2rad(angle);
    double l = length();
    double dx = (java.lang.Math.cos(angleR)) * l;
    double dy = (-(java.lang.Math.sin(angleR))) * l;
    p2.x = (p1.x) + dx;
    p2.y = (p1.y) + dy;
}