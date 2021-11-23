private void capacitor(double param1) {
    double c = param1;
    double z = (-1) / ((w) * c);
    matrixIncrement(impedance_i, z);
}