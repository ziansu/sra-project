private static boolean isInWhileIdiom(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    if (!(com.puppycrawl.tools.checkstyle.checks.coding.InnerAssignmentCheck.isComparison(ast.getParent()))) {
        return false;
    }
    return com.puppycrawl.tools.checkstyle.checks.coding.InnerAssignmentCheck.isInContext(ast.getParent(), com.puppycrawl.tools.checkstyle.checks.coding.InnerAssignmentCheck.ALLOWED_ASSIGNMENT_IN_COMPARISON_CONTEXT);
}