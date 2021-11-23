public org.uma.jmetal.algorithm.multiobjective.rnsgaii.util.PreferenceNSGAII<S> createUtilityFunction() {
    java.util.List<java.lang.Double> weights = new java.util.ArrayList<>();
    for (int i = 0; i < (org.uma.jmetal.algorithm.multiobjective.rnsgaii.RNSGAII.getProblem().getNumberOfObjectives()); i++) {
        weights.add((1.0 / (org.uma.jmetal.algorithm.multiobjective.rnsgaii.RNSGAII.getProblem().getNumberOfObjectives())));
    }
    org.uma.jmetal.algorithm.multiobjective.rnsgaii.util.PreferenceNSGAII<S> aux = new org.uma.jmetal.algorithm.multiobjective.rnsgaii.util.PreferenceNSGAII<S>(weights, this.interestPoint);
    return aux;
}