public java.lang.Object evaluateExpression(smartrics.rest.client.RestResponse response, java.lang.String expression, java.util.Map<java.lang.String, java.lang.String> imports) {
    if (expression == null) {
        return null;
    }
    smartrics.rest.fitnesse.fixture.support.Context context = smartrics.rest.fitnesse.fixture.support.Context.enter();
    removeOptimisationForLargeExpressions(expression, context);
    smartrics.rest.fitnesse.fixture.support.ScriptableObject scope = context.initStandardObjects();
    injectImports(context, scope, imports);
    injectFitNesseSymbolMap(scope);
    injectResponse(context, scope, response);
    java.lang.Object result = evaluateExpression(context, scope, expression);
    return result;
}