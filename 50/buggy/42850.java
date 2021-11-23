private void putError(org.jetbrains.mps.openapi.model.SNode node, jetbrains.mps.errors.IErrorReporter reporter) {
    if (!(jetbrains.mps.checkers.ErrorReportUtil.shouldReportError(node)))
        return ;
    
    getTypeErrorComponent().addError(node, reporter);
}