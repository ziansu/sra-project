public static java.lang.String getTable(AfterLuntilR scope, Pattern pattern) {
    Proposition propositionL = scope.getPropositionL();
    Proposition propositionR = scope.getPropositionR();
    return AfterLUntilRTable.getFormula(pattern, propositionR);
}