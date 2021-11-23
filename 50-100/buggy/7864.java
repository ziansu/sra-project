public double rand() {
    double stdv = 1.0 / (java.lang.Math.sqrt((((grads.dims[1]) * (weights.dims[2])) * (weights.dims[3]))));
    double stdv2 = stdv * 2;
    return ((java.lang.Math.random()) * stdv2) - stdv;
}