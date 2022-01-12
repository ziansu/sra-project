@java.lang.Override
public boolean equals(java.lang.Object other) {
    de.prob2.ui.verifications.ltl.LTLFormulaItem otherFormulaItem = ((de.prob2.ui.verifications.ltl.LTLFormulaItem) (other));
    if (((this.name.equals(otherFormulaItem.getName())) && (this.description.equals(otherFormulaItem.getDescription()))) && (this.formula.equals(otherFormulaItem.getFormula()))) {
        return true;
    }
    return false;
}