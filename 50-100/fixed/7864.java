public double rand() {
    double stdv = 1.0 / (java.lang.Math.sqrt(((grads.dims[1]) * (grads.dims[2]))));
    double stdv2 = stdv * 2;
    return ((java.lang.Math.random()) * stdv2) - stdv;
}