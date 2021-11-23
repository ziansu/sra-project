void parseFuncDecl() throws VC.Recogniser.SyntaxError {
    parseType();
    parseIdent();
    parseParaList();
    parseCompoundStmt();
}