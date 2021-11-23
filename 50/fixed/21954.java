public java.lang.Object VisitStatements(ASTStatements statements) {
    for (int i = 0; i < (statements.size()); i++) {
        statements.elementAt(i).Accept(this);
    }
    return null;
}