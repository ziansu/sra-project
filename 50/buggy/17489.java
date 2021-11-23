public double derivate_a(double a, double b, double alpha, double t_0, double f_0, double t, double f) {
    return (t - t_0) * (java.lang.Math.pow((f_0 / f), alpha));
}