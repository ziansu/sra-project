private static boolean isValidVelocity(double speedcomp, double speed, double radius, double frequency) {
    double rfreq2pi = (radius * frequency) * (TWOPI);
    double vcomp = (java.lang.Math.abs(speedcomp)) + (rfreq2pi * (java.lang.Math.sqrt((1 - (java.lang.Math.pow((speedcomp / speed), 2))))));
    java.lang.System.out.println(vcomp);
    if (vcomp > (MAX_ABSOLUTE_VELOCITY)) {
        return false;
    }
    return true;
}