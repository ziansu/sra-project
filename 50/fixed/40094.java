private org.compiere.util.Evaluatee getEvaluationContext() {
    if ((_evaluationContext) == null) {
        _evaluationContext = createEvaluationContext();
    }
    return _evaluationContext;
}