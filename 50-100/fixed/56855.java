private static de.uni_freiburg.informatik.ultimate.logic.Term comparison(de.uni_freiburg.informatik.ultimate.logic.Script script, java.lang.String functionSymbol, de.uni_freiburg.informatik.ultimate.logic.Term lhs, de.uni_freiburg.informatik.ultimate.logic.Term rhs) {
    de.uni_freiburg.informatik.ultimate.logic.Term rawTerm = script.term(functionSymbol, lhs, rhs);
    try {
        de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.linearTerms.AffineRelation ar = new de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.linearTerms.AffineRelation(script, rawTerm);
        return ar.positiveNormalForm(script);
    } catch (de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.linearTerms.NotAffineException e) {
        return rawTerm;
    }
}