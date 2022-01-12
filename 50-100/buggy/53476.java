@java.lang.Override
protected void backtrack(final V var) {
    (mWrongDecisions)++;
    mClausesMarkedForRemoval = new java.util.LinkedHashSet<>();
    final java.util.Set<V> variablesIncorrectlySet = mVariablesTemporarilySet.keySet();
    mVariablesTemporarilySet = new java.util.HashMap<>();
    mConjunctionEquivalentToFalse = false;
    de.uni_freiburg.informatik.ultimate.automata.nwalibrary.operations.minimization.maxsat2.MaxHornSatSolver.reEvaluateStatusOfAllClauses(variablesIncorrectlySet);
    setVariable(var, false);
    assert !(mConjunctionEquivalentToFalse) : "resetting variable did not help";
}