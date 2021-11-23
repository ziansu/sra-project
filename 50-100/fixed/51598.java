@java.lang.Override
public de.uni_freiburg.informatik.ultimate.smtinterpol.theory.epr.clauses.EprClause getFreshAlphaRenamedVersion() {
    de.uni_freiburg.informatik.ultimate.smtinterpol.theory.epr.TTSubstitution sub = new de.uni_freiburg.informatik.ultimate.smtinterpol.theory.epr.TTSubstitution();
    java.util.ArrayList<de.uni_freiburg.informatik.ultimate.smtinterpol.dpll.Literal> newLits = getFreshAlphaRenamedLiterals(sub);
    return new de.uni_freiburg.informatik.ultimate.smtinterpol.theory.epr.clauses.EprDerivedClause(newLits.toArray(new de.uni_freiburg.informatik.ultimate.smtinterpol.dpll.Literal[newLits.size()]), mTheory, mStateManager, mExplanation, true, sub, this);
}