private double[] cumsum(double[] p) {
    double[] q = new double[4];
    q[0] = p[0];
    q[1] = (q[0]) + (p[1]);
    q[2] = (q[1]) + (p[2]);
    q[3] = (q[2]) + (p[3]);
    return p;
}