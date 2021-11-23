private java.util.Collection<se.sics.p2ptoolbox.util.network.impl.DecoratedAddress> getTopNResults(java.util.List<se.sics.p2ptoolbox.election.api.LEContainer> cohorts, int size) {
    if (size < (cohorts.size()))
        return getResult(cohorts);
    
    java.util.Collections.sort(cohorts, leComparator);
    return getResult(cohorts.subList(0, (size - 1)));
}