private miniJava.SyntacticAnalyzer.WhileStmt parseWhileKW() {
    miniJava.SyntacticAnalyzer.WhileStmt whileAst = null;
    accept(TokenKind.WHILE_KW);
    miniJava.SyntacticAnalyzer.Statement stAst = null;
    parseLParen();
    miniJava.SyntacticAnalyzer.Expression eAst = parseExpression();
    parseRParen();
    miniJava.SyntacticAnalyzer.StatementList stlAst = parseStatementList();
    if ((stlAst.size()) > 1)
        stAst = new miniJava.SyntacticAnalyzer.BlockStmt(stlAst, null);
    else
        stAst = stlAst.get(0);
    
    whileAst = new miniJava.SyntacticAnalyzer.WhileStmt(eAst, stAst, null);
    return whileAst;
}