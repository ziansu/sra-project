public double getPoisson(double lambda) {
    double L = java.lang.Math.exp((-lambda));
    double p = 1.0;
    double k = 0.0;
    do {
        k = k + 0.5;
        p *= java.lang.Math.random();
    } while (p > L );
    double numero = 1 / (k - 0.1);
    numero = redondear((numero * 10));
    return numero;
}