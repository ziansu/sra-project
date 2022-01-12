public synchronized void initPercentageMatches() {
    perMatches = (matches.size()) / ((double) (matches.getLFGroup().size()));
    perMatchesOnMatching = (matches.size()) / ((double) (matches.getMatchingLFGroup().size()));
    if ((perMatches) > (perMatchesOnMatching))
        maxPercentageMatches = perMatches;
    else
        maxPercentageMatches = perMatchesOnMatching;
    
}