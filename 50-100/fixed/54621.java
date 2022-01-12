@java.lang.Override
protected void backtrack(final V var) {
    (mWrongDecisions)++;
    final java.util.Set<V> variablesIncorrectlySet = getVarTempSet().keySet();
    popStack();
    mConjunctionEquivalentToFalse = false;
    de.uni_freiburg.informatik.ultimate.automata.nwalibrary.operations.minimization.maxsat2.MaxSatSolver.reEvaluateStatusOfAllClauses(variablesIncorrectlySet, var);
    setVariable(var, false);
    de.uni_freiburg.informatik.ultimate.automata.nwalibrary.operations.minimization.maxsat2.MaxSatSolver.propagateAll();
}