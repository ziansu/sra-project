public java.lang.String visit(Visitor.ReturnStmt stmt) {
    return "return " + (stmt.getExpression());
}