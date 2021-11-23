public synchronized void initPercentageMatches() {
    perMatches = ((double) (matches.size())) / (matches.getLFGroup().size());
    perMatchesOnMatching = ((double) (matches.getMatchingLFGroup().size()));
    if ((perMatches) > (perMatchesOnMatching))
        maxPercentageMatches = perMatches;
    else
        maxPercentageMatches = perMatchesOnMatching;
    
}