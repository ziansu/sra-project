@java.lang.Override
public void reportError(com.jetbrains.jetpad.vclang.typechecking.error.reporter.ErrorReporter errorReporter, com.jetbrains.jetpad.vclang.term.expr.Expression... candidates) {
    errorReporter.report(new com.jetbrains.jetpad.vclang.typechecking.error.ArgInferenceError((("Unknown inference variable '" + (getName())) + "'"), null, null, candidates));
}