public void checkType(java.util.List<nez.peg.tpeg.TypedPEG.RuleExpr> rules) {
    for (nez.peg.tpeg.TypedPEG.RuleExpr ruleExpr : rules) {
        if ((this.ruleMap.put(ruleExpr.getRuleName(), ruleExpr)) != null) {
            nez.peg.tpeg.SemanticException.semanticError(ruleExpr.getRange(), ("duplicated rule: " + (ruleExpr.getRuleName())));
        }
    }
    for (nez.peg.tpeg.TypedPEG.RuleExpr ruleExpr : rules) {
        this.visitedExprSet.clear();
        this.labeledExprVerifier.visit(ruleExpr);
        this.checkType(ruleExpr);
    }
}