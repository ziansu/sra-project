private double formula(double k1, double k2, double k3) {
    return (k2 - ((c * (k3 - k1)) / 2)) + (((c * c) * ((k3 - (2 * k2)) + k3)) / 2);
}