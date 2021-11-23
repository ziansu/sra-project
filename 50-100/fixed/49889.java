private double scoreFunctionMC() {
    double score = 0.0;
    for (int col = 0; col < (subunitLen); col++) {
        double d1 = colDistances[col];
        double colScore = (org.biojava.nbio.structure.align.symm.refine.SymmOptimizer.M) / (java.lang.Math.pow((1 + (d1 / (d0))), 2));
        if (d1 > (d0))
            colScore -= org.biojava.nbio.structure.align.symm.refine.SymmOptimizer.A;
        
        score += colScore;
    }
    return score;
}