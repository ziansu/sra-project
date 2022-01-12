public void analyzeIncorrectMembershipTest() {
    java.util.List<AstConstraint> constraintList = AstUtil.getNestedConstraints(this.model);
    IncorrectMembershipTestExprAnalyzer analyzer = new IncorrectMembershipTestExprAnalyzer(this.model);
    for (AstConstraint constraint : constraintList) {
        IncorrectMembershipTestHelper helper = new IncorrectMembershipTestHelper(constraint);
        constraint.getExpr().accept(analyzer, helper);
    }
}