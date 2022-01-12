public org.jLOAF.action.Action getBestRun(java.util.List<org.jLOAF.casebase.ComplexCase> candidateRuns, org.jLOAF.casebase.Case problemRun) {
    if ((this.strategy) == null) {
        throw new java.lang.RuntimeException("Missing strategy for retrival");
    }
    org.jLOAF.casebase.ComplexCase.setClassGlobalStrategy(strategy);
    org.jLOAF.casebase.ComplexCase c = null;
    double best = -1;
    for (org.jLOAF.casebase.ComplexCase cc : candidateRuns) {
        double sim = problemRun.similarity(cc);
        if (sim > best) {
            best = sim;
            c = cc;
        }
    }
    return c.getAction();
}