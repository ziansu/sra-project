private com.intellij.xdebugger.impl.evaluate.EvaluationInputComponent createInputComponent(com.intellij.xdebugger.evaluation.EvaluationMode mode, com.intellij.xdebugger.impl.evaluate.XExpression text) {
    final com.intellij.openapi.project.Project project = mySession.getProject();
    text = com.intellij.xdebugger.impl.breakpoints.XExpressionImpl.changeMode(text, mode);
    if (mode == (com.intellij.xdebugger.evaluation.EvaluationMode.EXPRESSION)) {
        return new com.intellij.xdebugger.impl.evaluate.ExpressionInputComponent(project, myEditorsProvider, mySourcePosition, text);
    }else {
        return new com.intellij.xdebugger.impl.evaluate.CodeFragmentInputComponent(project, myEditorsProvider, mySourcePosition, text, myDisposable);
    }
}