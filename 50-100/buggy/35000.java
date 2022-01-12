private boolean initializeRequiredContext(final org.eclipse.jdt.ui.text.java.ContentAssistInvocationContext context) {
    org.eclipse.jdt.ui.text.java.JavaContentAssistInvocationContext jdtCtx = org.eclipse.recommenders.utils.Checks.castOrNull(context);
    if (jdtCtx == null) {
        return false;
    }
    ctx = new org.eclipse.recommenders.completion.rcp.RecommendersCompletionContext(jdtCtx, astProvider);
    final com.google.common.base.Optional<org.eclipse.jdt.internal.compiler.lookup.Scope> optionalScope = org.eclipse.recommenders.internal.chain.rcp.ScopeAccessWorkaround.resolveScope(ctx);
    if (!(optionalScope.isPresent())) {
        return false;
    }
    scope = optionalScope.get();
    return true;
}