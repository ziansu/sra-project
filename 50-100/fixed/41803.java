@java.lang.Override
public void visitMethod(org.sonar.plugins.java.api.tree.MethodTree method) {
    if (!(checkIfLongResourceResolver(method))) {
        java.util.Collection<org.sonar.plugins.java.api.tree.VariableTree> resolvers = findResolversInMethod(method);
        for (org.sonar.plugins.java.api.tree.VariableTree injector : resolvers) {
            if (!(checkIfResourceResolverIsClosed(method, injector))) {
                context.reportIssue(this, injector, com.cognifide.aemrules.checks.resourceresolver.close.ResourceResolverShouldBeClosed.RULE_MESSAGE);
            }
        }
    }
    super.visitMethod(method);
}