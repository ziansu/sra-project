private double scoreFunctionCEMC() {
    double score = 0.0;
    for (int col = 0; col < (subunitLen); col++) {
        double d1 = colDistances[col];
        double colScore = (org.biojava.nbio.structure.align.symm.refine.SymmGapOptimizer.M) / (1 + ((d1 * d1) / ((d0) * (d0))));
        score += colScore;
    }
    return score - ((gaps) * (org.biojava.nbio.structure.align.symm.refine.SymmGapOptimizer.G));
}