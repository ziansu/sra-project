private java.lang.String makePatternRootName(java.lang.String patternName, java.util.List<nl.ou.dpd.domain.matching.Solution> solutions) {
    if ((solutions.size()) > 1) {
        return java.lang.String.format("%s (%d)", patternName, solutions.size());
    }
    return patternName;
}