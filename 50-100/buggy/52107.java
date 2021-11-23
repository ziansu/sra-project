public void analyzeIncorrectMembershipTest() {
    java.util.List<AstConstraint> constraintList = AstUtil.getNestedConstraints(this.model);
    for (AstConstraint constraint : constraintList) {
        IncorrectMembershipTestHelper helper = new IncorrectMembershipTestHelper(constraint);
        IncorrectMembershipTestExprAnalyzer analyzer = new IncorrectMembershipTestExprAnalyzer(this.model);
        constraint.getExpr().accept(analyzer, helper);
    }
}