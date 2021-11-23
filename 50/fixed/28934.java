private java.lang.String makePatternRootName(java.lang.String patternName, java.util.List<nl.ou.dpd.domain.matching.Solution> solutions) {
    return java.lang.String.format("%s (%d)", patternName, solutions.size());
}