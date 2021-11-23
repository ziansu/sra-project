public compiler.parser.ast.AST declarations() throws java.lang.Exception {
    compiler.parser.ast.AST dec = new compiler.parser.ast.AST(compiler.parser.ast.AST.AstType.declarations);
    dec.left = varDecl(false);
    dec.right = funcDel();
    if (!(dec.hasChildren()))
        dec = null;
    
    return dec;
}