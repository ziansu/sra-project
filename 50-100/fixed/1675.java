private miniJava.SyntacticAnalyzer.WhileStmt parseWhileKW() {
    miniJava.SyntacticAnalyzer.WhileStmt whileAst = null;
    accept(TokenKind.WHILE_KW);
    miniJava.SyntacticAnalyzer.Statement stAst = null;
    parseLParen();
    miniJava.SyntacticAnalyzer.Expression eAst = parseExpression();
    parseRParen();
    miniJava.SyntacticAnalyzer.StatementList stlAst = parseStatementList(new miniJava.SyntacticAnalyzer.StatementList());
    if ((stlAst.size()) == 1)
        stAst = stlAst.get(0);
    else
        stAst = new miniJava.SyntacticAnalyzer.BlockStmt(stlAst, null);
    
    whileAst = new miniJava.SyntacticAnalyzer.WhileStmt(eAst, stAst, null);
    return whileAst;
}