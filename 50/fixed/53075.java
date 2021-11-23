private compiler.parser.ast.AST ident() throws java.lang.Exception {
    getNextToken();
    errorCheck(Token.IDENTIFIER);
    return new compiler.parser.ast.AST(compiler.parser.ast.AST.AstType.terminal, compiler.parser.ast.AST.currToken);
}