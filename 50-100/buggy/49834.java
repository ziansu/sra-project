public org.shaolin.javacc.statement.ExecutionResult execute(org.shaolin.javacc.context.OOEESmtEvaluationContext evaluationContext) {
    org.shaolin.javacc.statement.ExecutionResult execResult = new org.shaolin.javacc.statement.ExecutionResult();
    if ((returnExpNode) != null) {
        try {
            java.lang.Object result = returnExpNode.evaluate(evaluationContext);
            execResult.setReturnResult(result);
            execResult.setResultCode(StatementConstants.returnEnding);
        } catch (org.shaolin.javacc.exception.EvaluationException e) {
            execResult.setResultCode(StatementConstants.exceptionEnding);
            execResult.setCauseException(e.getCause());
        }
    }
    return execResult;
}