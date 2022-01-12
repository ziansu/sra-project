public double[] getPositionFromHeading(double dist, double heading) {
    double[] pt = new double[2];
    double rAngle = java.lang.Math.toRadians((heading + 180.0));
    pt[0] = (position[0]) + ((java.lang.Math.cos(rAngle)) * dist);
    pt[1] = (position[1]) + ((java.lang.Math.sin(rAngle)) * dist);
    return pt;
}