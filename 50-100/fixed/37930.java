private double[] calculateUVector(java.util.Vector x) {
    double[] u = new double[getNeuronsCount()];
    for (int i = 0; i < (getNeuronsCount()); i++) {
        for (int j = 0; j < (argumentsCount); j++) {
            double z = neurons[i].getZ(j, x);
            u[i] += z * z;
        }
    }
    return u;
}