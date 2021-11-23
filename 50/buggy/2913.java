private void inductor(double param1) {
    double l = param1;
    double z = (w) * l;
    matrixIncrement(impedance_i, z);
}