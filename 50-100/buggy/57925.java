protected void executeOperations(final java.util.List<org.bonitasoft.engine.core.operation.model.SOperation> operations, final java.util.Map<java.lang.String, java.lang.Object> context, final org.bonitasoft.engine.core.expression.control.model.SExpressionContext expressionContext, final org.bonitasoft.engine.core.process.instance.model.SProcessInstance sProcessInstance) throws org.bonitasoft.engine.commons.exceptions.SBonitaException {
    if ((operations != null) && (!(operations.isEmpty()))) {
        expressionContext.setInputValues(context);
        operationService.execute(operations, expressionContext);
    }
}