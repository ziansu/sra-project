private void simpsonIntegrate(int eval, int from, int to) {
    simpson = new org.apache.commons.math3.analysis.integration.SimpsonIntegrator();
    double integral = simpson.integrate(eval, uf, from, to);
    results[0] = integral;
}