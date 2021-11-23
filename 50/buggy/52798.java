public void visit(org.stevens.cs562.sql.sqlimpl.ComparisonAndComputeExpression expression) {
    expression.getLeft().accept(this);
    expression.getRight().accept(this);
    java.lang.System.out.println("Visit ComparisonAndComputeExpression");
}