private void printReturnStatement(final org.nest.spl.prettyprinter.ASTReturnStmt astReturnStmt) {
    if (astReturnStmt.getExpr().isPresent()) {
        final java.lang.String returnExpressionAsString = expressionsPrettyPrinter.print(astReturnStmt.getExpr().get());
        println(("return " + returnExpressionAsString));
    }else {
        println("return");
    }
}