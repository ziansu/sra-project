public static boolean hasEntryEvent(org.yakindu.sct.model.sgraph.Vertex state) throws org.eclipse.incquery.runtime.exception.IncQueryException {
    for (inc.StatesWithEntryEventMatch statesWithEntryEventMatch : inc.Helper.runOnceEngine.getAllMatches(inc.StatesWithEntryEventMatcher.querySpecification())) {
        if ((statesWithEntryEventMatch.getState()) == state) {
            return true;
        }
    }
    return false;
}