private boolean isSimplified(java.lang.String exp) {
    if (exp.contains("("))
        return false;
    
    java.util.ArrayList<java.util.ArrayList<term.Term>> likeTerms = sortTerms(getTerms(exp));
    for (java.util.ArrayList<term.Term> l : likeTerms) {
        if ((l.size()) > 1)
            return false;
        
    }
    return true;
}