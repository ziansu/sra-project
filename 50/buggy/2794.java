public static java.lang.String getTable(AfterL scope, Pattern pattern) {
    Proposition propositionL = scope.getPropositionL();
    return AfterLTable.getFormula(propositionL, pattern);
}