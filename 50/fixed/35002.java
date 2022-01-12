private static boolean isInWhileIdiom(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    return (com.puppycrawl.tools.checkstyle.checks.coding.InnerAssignmentCheck.isComparison(ast.getParent())) && (com.puppycrawl.tools.checkstyle.checks.coding.InnerAssignmentCheck.isInContext(ast.getParent(), com.puppycrawl.tools.checkstyle.checks.coding.InnerAssignmentCheck.ALLOWED_ASSIGNMENT_IN_COMPARISON_CONTEXT));
}