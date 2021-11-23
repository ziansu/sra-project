@java.lang.Override
public void postConvertQuantifier(de.uni_freiburg.informatik.ultimate.logic.QuantifiedFormula old, de.uni_freiburg.informatik.ultimate.logic.Term newBody) {
    if ((old.getQuantifier()) == (de.uni_freiburg.informatik.ultimate.logic.QuantifiedFormula.EXISTS)) {
        super.postConvertQuantifier(old, newBody);
    }else {
        final de.uni_freiburg.informatik.ultimate.logic.Theory t = old.getTheory();
        final de.uni_freiburg.informatik.ultimate.logic.Term negNewBody = t.not(newBody);
        final de.uni_freiburg.informatik.ultimate.logic.Term res = t.not(t.exists(old.getVariables(), negNewBody));
        setResult(res);
    }
}