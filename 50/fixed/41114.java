public java.lang.Object VisitFunctionDefinitions(ASTFunctionDefinitions fundefinitions) {
    int i;
    for (i = 0; i < (fundefinitions.size()); i++)
        fundefinitions.elementAt(i).Accept(this);
    
    return null;
}