public void computePSF(final double[] alpha, final double[] beta, double deltaX, double deltaY) {
    computeDefocus();
    setPhi(alpha);
    setRho(beta);
    computePSF();
}