public java.util.List<java.lang.String> explainRedundantConstraint(org.prop4j.Node[] clauses, java.util.HashMap<java.lang.Object, java.lang.Integer> map) {
    reason.clear();
    if (isViolated(clauses)) {
        java.util.ArrayList<org.prop4j.Literal> literalList = getLiterals(violatedClause);
        for (org.prop4j.Literal l : literalList) {
            java.lang.String tmpReason = explainVariable(l);
            addToReasonListOptionally(tmpReason);
        }
        return reason;
    }
    findUnitOpenClauses(featuresRedundantConstr, clauses);
    BCP(clauses);
    return shortestExplanation(clauses, map, null, de.ovgu.featureide.fm.core.explanations.LTMS.ExplanationMode.Redundancy);
}