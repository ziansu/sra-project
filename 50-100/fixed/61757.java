private java.math.BigInteger computeCostOfLevel(int level) {
    org.sat4j.core.Vec<it.unical.mat.jwasp.optimization.OptimizationLiteral> optLiterals = solver.getOptimizationLiterals(level);
    java.math.BigInteger value = java.math.BigInteger.valueOf(0);
    for (int i = 0; i < (optLiterals.size()); i++) {
        int lit = optLiterals.get(i).getLiteral();
        if (solver.isTrueInModel(lit))
            value.add(solver.getOptimizationOfLiteral(lit, level).getWeight());
        
    }
    return value;
}