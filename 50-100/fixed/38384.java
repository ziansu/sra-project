public static boolean recordCastOrError(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.psi.JetExpression expression, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.types.JetType type, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.BindingTrace trace, boolean canBeCast, boolean recordExpressionType) {
    if (canBeCast) {
        trace.record(org.jetbrains.kotlin.resolve.BindingContext.SMARTCAST, expression, type);
        if (recordExpressionType) {
            trace.recordType(expression, type);
        }
    }else {
        trace.report(org.jetbrains.kotlin.diagnostics.Errors.SMARTCAST_IMPOSSIBLE.on(expression, type, expression.getText()));
    }
    return canBeCast;
}