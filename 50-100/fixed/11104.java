public void analyze(semanticAnalyzer.AssignStatementTail AST) {
    output.accept(((AST.getLine()) + ": analyze AssignStatementTail\n"));
    if ((AST.getAddExpression()) != null) {
        analyze(AST.getAddExpression());
    }
    analyze(AST.getExp());
}