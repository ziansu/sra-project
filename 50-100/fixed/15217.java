public double gibYLichtRechts() {
    double beta = 1 / (java.lang.Math.tan(0.25));
    double epsilon = 90 - ((_ausrichtung) + beta);
    double c = 5 / (java.lang.Math.sin(beta));
    return (_yPos) - (c * (java.lang.Math.cos(epsilon)));
}