public de.uni_freiburg.informatik.ultimate.logic.Term convertNotOrNot(de.uni_freiburg.informatik.ultimate.logic.Term input) {
    de.uni_freiburg.informatik.ultimate.logic.ApplicationTerm notTerm = ((de.uni_freiburg.informatik.ultimate.logic.ApplicationTerm) (mTracker.getProvedTerm(input)));
    assert (notTerm.getFunction().getName()) == "not";
    de.uni_freiburg.informatik.ultimate.logic.ApplicationTerm orTerm = ((de.uni_freiburg.informatik.ultimate.logic.ApplicationTerm) (notTerm.getParameters()[0]));
    de.uni_freiburg.informatik.ultimate.logic.Term orRewrite = convertOrNot(mTracker.reflexivity(orTerm));
    return convertNot(mTracker.congruence(input, new de.uni_freiburg.informatik.ultimate.logic.Term[]{ orRewrite }));
}