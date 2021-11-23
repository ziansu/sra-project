private void addAlterFactors(datastructures.mt.MinimalTheory theory, int noOfAlterFactors) {
    java.lang.String factor = "";
    for (int i = 0; i < noOfAlterFactors; i++) {
        int random = randomIndex(names.size());
        factor = names.get(random).get(0);
        theory.addBundle(factor);
        names.remove(random);
    }
}