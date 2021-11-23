public boolean isFormulaCorrect(com.jayantkrish.jklol.ccg.lambda2.Expression2 pnpFormula) {
    java.lang.String expressionString = org.allenai.wikitables.WikiTablesUtil.toSempreLogicalForm(pnpFormula);
    try {
        edu.stanford.nlp.sempre.Formula sempreFormula = edu.stanford.nlp.sempre.Formula.fromString(expressionString);
        return org.allenai.wikitables.WikiTablesDataProcessor.isFormulaCorrect(sempreFormula, context, targetValue, null);
    } catch (java.lang.Exception ex) {
        java.lang.System.err.println(("Bad formula: " + expressionString));
        return false;
    }
}