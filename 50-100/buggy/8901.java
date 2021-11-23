@java.lang.Override
public boolean checkImpl(wjtoth.cyclicstablematching.PreferenceSystem preferenceSystem) {
    for (wjtoth.cyclicstablematching.Matching matching : matchings) {
        wjtoth.cyclicstablematching.MatchingPS mathcingPS = new wjtoth.cyclicstablematching.MatchingPS(matching, preferenceSystem);
        if ((mathcingPS.size()) == 0) {
            continue;
        }
        boolean isInternallyBlocked = mathcingPS.isInternallyBlocked();
        if (isInternallyBlocked) {
            return false;
        }
        java.util.List<java.util.List<java.lang.Integer>> potentialBlocks = mathcingPS.firstOrderDissatisfied();
        if (checkImpl(potentialBlocks, mathcingPS, preferenceSystem)) {
            return true;
        }
    }
    return false;
}