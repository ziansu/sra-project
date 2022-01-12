private boolean initializeRequiredContext(final org.eclipse.jdt.ui.text.java.ContentAssistInvocationContext context) {
    if (!(context instanceof org.eclipse.jdt.ui.text.java.JavaContentAssistInvocationContext)) {
        return false;
    }
    org.eclipse.jdt.ui.text.java.JavaContentAssistInvocationContext jdtCtx = ((org.eclipse.jdt.ui.text.java.JavaContentAssistInvocationContext) (context));
    ctx = new org.eclipse.recommenders.completion.rcp.RecommendersCompletionContext(jdtCtx, astProvider);
    final com.google.common.base.Optional<org.eclipse.jdt.internal.compiler.lookup.Scope> optionalScope = org.eclipse.recommenders.internal.chain.rcp.ScopeAccessWorkaround.resolveScope(ctx);
    if (!(optionalScope.isPresent())) {
        return false;
    }
    scope = optionalScope.get();
    return true;
}