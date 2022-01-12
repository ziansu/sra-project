private compiler.parser.ast.AST statSequence() throws java.lang.Exception {
    compiler.parser.ast.AST stSeq = new compiler.parser.ast.AST(compiler.parser.ast.AST.AstType.statSequence);
    stSeq.left = statement();
    if ((stSeq.left) == null)
        return null;
    
    if ((compiler.parser.ast.AST.nextToken.getT()) != (Token.SEMI_COLON))
        return stSeq;
    
    getNextToken();
    stSeq.mid = new compiler.parser.ast.AST(compiler.parser.ast.AST.AstType.terminal, compiler.parser.ast.AST.currToken);
    stSeq.right = statSequence();
    return stSeq;
}