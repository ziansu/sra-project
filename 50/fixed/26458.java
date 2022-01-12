public java.util.List<org.sifrproject.scoring.cvalue.CValueTerm> getTerms(boolean sort) {
    if (sort) {
        java.util.Collections.sort(terms, CValueTerm.importanceComparator);
    }
    return terms;
}