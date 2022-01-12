private void printCosts(int level) {
    org.sat4j.core.Vec<java.math.BigInteger> costsToPrint = new org.sat4j.core.Vec<java.math.BigInteger>();
    costs.copyTo(costsToPrint);
    for (int i = level + 1; i < (solver.getNumberOfLevels()); i++) {
        costsToPrint.set(i, computeCostOfLevel(i));
    }
    solver.printCosts(costsToPrint);
}