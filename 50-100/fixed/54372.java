public double derivate_alpha(double a, double b, double alpha, double t_0, double f_0, double t, double f) {
    return (((a * (t - t_0)) + b) * (java.lang.Math.pow((f / f_0), alpha))) * (java.lang.Math.log((f / f_0)));
}