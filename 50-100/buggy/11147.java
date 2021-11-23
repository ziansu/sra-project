private de.uni_freiburg.informatik.ultimate.logic.Term buildSymmetryAxiom(de.uni_freiburg.informatik.ultimate.logic.Sort s) {
    de.uni_freiburg.informatik.ultimate.logic.TermVariable qvar1 = variable("x", s);
    de.uni_freiburg.informatik.ultimate.logic.TermVariable qvar2 = variable("y", s);
    return quantifier(de.uni_freiburg.informatik.ultimate.eprequalityaxiomsadder.FORALL, new de.uni_freiburg.informatik.ultimate.logic.TermVariable[]{ qvar1 , qvar2 }, term("=>", term(mNewEqualsSymbol, qvar1, qvar2), term(mNewEqualsSymbol, qvar1, qvar2)));
}