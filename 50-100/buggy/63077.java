private wycc.util.Pair<wyal.lang.WyalFile.Expr[], wyil.stage.VerificationConditionGenerator.Context> translateExpressionsWithChecks(wyil.stage.Tuple<wyc.lang.WhileyFile.Expr> exprs, wyil.stage.VerificationConditionGenerator.Context context) {
    for (wyc.lang.WhileyFile.Expr expr : exprs) {
        checkExpressionPreconditions(expr, context);
    }
    for (wyc.lang.WhileyFile.Expr expr : exprs) {
        context = assumeExpressionPostconditions(expr, context);
    }
    return new wycc.util.Pair(translateExpressions(exprs, context.getEnvironment()), context);
}