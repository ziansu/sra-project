@java.lang.Override
public boolean filterConnectionsForType(java.lang.String candidate, java.util.List<java.lang.String> pos) {
    boolean result = false;
    java.lang.String[] splitted = candidate.split(" ");
    if ((((bootstrapping.RelationsFilter.candidateContainsOtherTerms(candidate)) || (bootstrapping.RelationsFilter.isIncompleteNP(pos, candidate))) || (bootstrapping.RelationsFilter.isSingleChar(candidate))) || ((splitted.length) >= 8)) {
        result = true;
    }
    return result;
}