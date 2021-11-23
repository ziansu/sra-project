private void reportException(@android.support.annotation.Nullable
com.duy.pascal.interperter.ast.expressioncontext.ExpressionContext context, com.duy.pascal.interperter.tokens.grouping.GrouperToken grouperToken, java.lang.Exception e) throws java.lang.Exception {
    java.lang.System.out.println("ExpressionContextMixin.reportException");
    if (context == null) {
        throw e;
    }
    com.duy.pascal.interperter.exceptions.DiagnosticsListener listener = context.getListener(com.duy.pascal.interperter.exceptions.DiagnosticsListener.class);
    if (listener != null) {
        listener.add(new com.duy.pascal.interperter.exceptions.Diagnostic(e));
        grouperToken.nextStatement();
    }else {
        throw e;
    }
}