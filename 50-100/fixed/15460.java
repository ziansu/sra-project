public de.uni_freiburg.informatik.ultimate.logic.Term convertNotOrNot(final de.uni_freiburg.informatik.ultimate.logic.Term input) {
    final de.uni_freiburg.informatik.ultimate.logic.ApplicationTerm notTerm = ((de.uni_freiburg.informatik.ultimate.logic.ApplicationTerm) (mTracker.getProvedTerm(input)));
    assert (notTerm.getFunction().getName()) == "not";
    final de.uni_freiburg.informatik.ultimate.logic.ApplicationTerm orTerm = ((de.uni_freiburg.informatik.ultimate.logic.ApplicationTerm) (notTerm.getParameters()[0]));
    final de.uni_freiburg.informatik.ultimate.logic.Term orRewrite = convertOrNot(mTracker.reflexivity(orTerm));
    return convertNot(mTracker.congruence(input, new de.uni_freiburg.informatik.ultimate.logic.Term[]{ orRewrite }));
}