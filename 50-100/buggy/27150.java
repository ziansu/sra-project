public compiler.parser.ast.AST body() throws java.lang.Exception {
    errorCheck(Token.OPEN_CURL);
    compiler.parser.ast.AST bodyNode = new compiler.parser.ast.AST(compiler.parser.ast.AST.AstType.body);
    bodyNode.left = new compiler.parser.ast.AST(compiler.parser.ast.AST.AstType.terminal, compiler.parser.ast.AST.currToken);
    bodyNode.mid = statSequence();
    getNextToken();
    errorCheck(Token.CLOSE_CURL);
    bodyNode.right = new compiler.parser.ast.AST(compiler.parser.ast.AST.AstType.terminal, compiler.parser.ast.AST.currToken);
    return bodyNode;
}