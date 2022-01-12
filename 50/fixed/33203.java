public java.lang.Object VisitFunctionCallStatement(ASTFunctionCallStatement statement) {
    for (int i = 0; i < (statement.size()); i++)
        statement.elementAt(i).Accept(this);
    
    return null;
}