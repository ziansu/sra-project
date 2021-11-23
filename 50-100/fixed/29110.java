private java.lang.String extractFormula(java.lang.String[] matchingRow, java.lang.String termToMatch, int indexToSearch) {
    java.lang.String formula = matchingRow[CuratedMetabolitesFileColumnIdentifier.MOLECULAR_FORMULA.getID()];
    if (formula == null)
        return formula;
    
    if (formula.contains("|")) {
        java.lang.String[] formulas = formula.split("\\|");
        return formulas[getMatchingIndex(extractSearchTerms(matchingRow, indexToSearch), termToMatch)];
    }else {
        return formula;
    }
}