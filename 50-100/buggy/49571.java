@java.lang.Override
protected void process(org.moeaframework.core.Population population) {
    org.moeaframework.core.NondominatedSortingPopulation ndspop = new org.moeaframework.core.NondominatedSortingPopulation();
    ndspop.addAll(population);
    int numGood = ((int) (java.lang.Math.floor(((population.size()) * (fraction)))));
    ndspop.truncate(numGood);
    for (org.moeaframework.core.Solution individual : ndspop) {
        individual.setAttribute(mining.label.LABELATTRIB, 1);
    }
}