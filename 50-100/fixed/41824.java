public java.util.HashSet<de.uni_freiburg.informatik.ultimate.logic.ApplicationTerm> getAllConstants() {
    java.util.HashSet<de.uni_freiburg.informatik.ultimate.logic.ApplicationTerm> result = new java.util.HashSet<>();
    for (java.util.Map.Entry<java.lang.String, de.uni_freiburg.informatik.ultimate.logic.FunctionSymbol> en : mTheory.getDeclaredFuns().entrySet()) {
        de.uni_freiburg.informatik.ultimate.logic.FunctionSymbol fs = en.getValue();
        if ((fs.getParameterSorts().length) == 0)
            result.add(mTheory.term(fs));
        
    }
    return result;
}