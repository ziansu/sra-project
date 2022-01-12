@java.lang.Override
protected boolean isSatImpl(jbse.val.Expression exp) throws jbse.dec.exc.DecisionException {
    final jbse.val.Expression expSimpl = ((jbse.val.Expression) (simplifyLocal(exp)));
    if (jbse.dec.DecisionProcedureSignAnalysis.isTrivial(expSimpl)) {
        final jbse.dec.DecisionProcedureSignAnalysis.SignPredicate predicateOperand = deduceSignPredicate(jbse.dec.DecisionProcedureSignAnalysis.getOperand(expSimpl));
        final jbse.dec.DecisionProcedureSignAnalysis.SignPredicate predicateRange = jbse.dec.DecisionProcedureSignAnalysis.bestApproxRange(expSimpl);
        if (predicateOperand.contradicts(predicateRange)) {
            return false;
        }
    }
    return super.isSatImpl(expSimpl);
}