@java.lang.Override
protected boolean isSatImpl(jbse.val.Expression exp, jbse.val.Expression expSimpl) throws jbse.dec.exc.DecisionException {
    if (jbse.dec.DecisionProcedureSignAnalysis.isTrivial(expSimpl)) {
        final jbse.dec.DecisionProcedureSignAnalysis.SignPredicate predicateOperand = deduceSignPredicate(jbse.dec.DecisionProcedureSignAnalysis.getOperand(expSimpl));
        final jbse.dec.DecisionProcedureSignAnalysis.SignPredicate predicateRange = jbse.dec.DecisionProcedureSignAnalysis.bestApproxRange(expSimpl);
        if (predicateOperand.contradicts(predicateRange)) {
            return false;
        }
    }
    return super.isSatImpl(exp, expSimpl);
}