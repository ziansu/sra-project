public void rewrite(int from, int to, int pivot) {
    if (to > (wyautl.core.Automaton.K_VOID)) {
        wyrw.util.IncrementalAutomatonMinimiser.ParentInfo fromParents = parents.get(from);
        expandParents();
        rewriteParents(from, to);
        eliminateUnreachableState(from);
        eliminateUnreachableAbovePivot(pivot);
        collapseEquivalentParents(from, to, fromParents);
    }else {
        eliminateUnreachableState(from);
    }
    checkReachabilityInvariant();
    checkParentsInvariant();
    checkChildrenInvariant();
}