private void rombergIntegrate(int eval, int from, int to) {
    romberg = new org.apache.commons.math3.analysis.integration.RombergIntegrator();
    double integral = romberg.integrate(eval, uf, from, to);
    results[2] = integral;
}