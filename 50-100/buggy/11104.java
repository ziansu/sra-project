public void analyze(semanticAnalyzer.AssignStatementTail AST) {
    output.accept(((AST.getLine()) + ": analyze AssignStatementTail\n"));
    if ((AST.getAddExpression()) != null) {
        java.lang.System.out.println("ANALYZE ARRAY EXPRESSION");
        analyze(AST.getAddExpression());
    }
    analyze(AST.getExp());
}