public java.util.List<org.sifrproject.scoring.cvalue.CValueTerm> getTerms(boolean sort) {
    if (sort)
        terms.sort(CValueTerm.importanceComparator);
    
    return terms;
}