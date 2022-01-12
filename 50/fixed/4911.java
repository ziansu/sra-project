public static java.lang.String getTable(BetweenLandR scope, Pattern pattern) {
    Proposition propositionR = scope.getPropositionR();
    return BetweenLandRTable.getFormula(pattern, propositionR);
}