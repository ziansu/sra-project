public boolean checkImpl(wjtoth.cyclicstablematching.Matching matching, wjtoth.cyclicstablematching.PreferenceSystem preferenceSystem) {
    wjtoth.cyclicstablematching.MatchingPS mathcingPS = new wjtoth.cyclicstablematching.MatchingPS(matching, preferenceSystem);
    if ((mathcingPS.size()) == 0) {
        return false;
    }
    boolean isInternallyBlocked = mathcingPS.isInternallyBlocked();
    if (isInternallyBlocked) {
        return false;
    }
    java.util.List<java.util.List<java.lang.Integer>> potentialBlocks = mathcingPS.firstOrderDissatisfied();
    if (checkImpl(potentialBlocks, mathcingPS, preferenceSystem)) {
        return true;
    }
    return false;
}