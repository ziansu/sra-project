@java.lang.Override
public boolean equals(java.lang.Object other) {
    if (other == (this)) {
        return true;
    }
    if (!(other instanceof de.prob2.ui.verifications.ltl.LTLFormulaItem)) {
        return false;
    }
    de.prob2.ui.verifications.ltl.LTLFormulaItem otherFormulaItem = ((de.prob2.ui.verifications.ltl.LTLFormulaItem) (other));
    return ((this.name.equals(otherFormulaItem.getName())) && (this.description.equals(otherFormulaItem.getDescription()))) && (this.formula.equals(otherFormulaItem.getFormula()));
}