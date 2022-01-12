public void showResult(de.prob2.ui.verifications.CheckingResultItem resultItem, de.prob2.ui.verifications.AbstractCheckableItem item, java.util.List<de.prob.statespace.Trace> traces) {
    super.showResult(resultItem, item);
    if (!(traces.isEmpty())) {
        ((de.prob2.ui.verifications.ltl.formula.LTLFormulaItem) (item)).setCounterExample(traces.get(0));
    }
}