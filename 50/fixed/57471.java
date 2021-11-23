public double emissionLogPr(double latentState, double emission) {
    return bayonet.distributions.Normal.logDensity(emission, 0, (((beta) * (beta)) * (java.lang.Math.exp(latentState))));
}