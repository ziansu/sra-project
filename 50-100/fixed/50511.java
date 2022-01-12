public void adjustOdometry(double a, double alpha) {
    p.x += a * (java.lang.Math.cos(p.theta));
    p.y += a * (java.lang.Math.sin(p.theta));
    p.theta = ((p.theta) + ((alpha * (java.lang.Math.PI)) / 180)) % (2 * (java.lang.Math.PI));
    if ((p.theta) < 0)
        p.theta = (2 * (java.lang.Math.PI)) + (p.theta);
    
}