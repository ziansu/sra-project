private org.eclipse.emf.compare.Match getMatchWithNullValues(org.eclipse.emf.compare.Match match) {
    if (match != null) {
        for (org.eclipse.emf.compare.Match subMatch : match.getSubmatches()) {
            if (((subMatch.getLeft()) == null) && ((subMatch.getRight()) == null)) {
                return subMatch;
            }
        }
    }
    return null;
}