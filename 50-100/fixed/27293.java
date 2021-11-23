@java.lang.Override
protected void convert(de.uni_freiburg.informatik.ultimate.logic.Term term) {
    if (m_ScopedSubstitutionMapping.containsKey(term)) {
        setResult(m_ScopedSubstitutionMapping.get(term));
    }else {
        if (term instanceof de.uni_freiburg.informatik.ultimate.logic.QuantifiedFormula) {
            m_ScopedSubstitutionMapping.beginScope();
            de.uni_freiburg.informatik.ultimate.logic.QuantifiedFormula qFormula = ((de.uni_freiburg.informatik.ultimate.logic.QuantifiedFormula) (term));
            removeQuantifiedVarContainingKeys(qFormula);
            term = renameQuantifiedVarsThatOccurInValues(qFormula);
        }else
            if (term instanceof de.uni_freiburg.informatik.ultimate.logic.LetTerm) {
                throw new java.lang.UnsupportedOperationException("LetTerm not supported");
            }
        
        super.convert(term);
    }
}