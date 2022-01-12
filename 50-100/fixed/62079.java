public org.kframework.krun.api.SearchResults stepAll(int steps) throws org.kframework.krun.KRunExecutionException {
    if ((currentState) == null) {
        throw new java.lang.IllegalStateException(("Cannot step without a current state to step from. " + ("If you previously used the search command you must" + "first select a solution with the select command before executing steps of rewrites!")));
    }
    org.kframework.krun.api.SearchResults results = executor.search(null, steps, SearchType.PLUS, org.kframework.krun.api.ExecutorDebugger.defaultPattern, getState(currentState).getRawResult(), org.kframework.krun.api.ExecutorDebugger.defaultPatternInfo, false);
    mergeSearchGraph(results.getGraph());
    currentState = null;
    return results;
}