public wycc.util.Pair<wyal.lang.WyalFile.Expr, wyil.stage.VerificationConditionGenerator.Context> translateExpressionWithChecks(wyc.lang.WhileyFile.Expr expr, java.lang.Integer selector, wyil.stage.VerificationConditionGenerator.Context context) {
    checkExpressionPreconditions(expr, context);
    context = assumeExpressionPostconditions(expr, context);
    return new wycc.util.Pair(translateExpression(expr, selector, context.getEnvironment()), context);
}