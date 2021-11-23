public void removeOptimizationLiteral(int literal, int level) {
    optimizationLiterals.get(level).remove(getOptimizationOfLiteral(literal));
}