private void trapezoidIntegrate(int eval, int from, int to) {
    trapeze = new org.apache.commons.math3.analysis.integration.TrapezoidIntegrator();
    double integral = trapeze.integrate(100000, uf, from, to);
    results[1] = integral;
}