public java.lang.Object VisitFunctionDefinitions(ASTFunctionDefinitions fundefinitions) {
    int i;
    for (i = 0; i < (functiondefs.size()); i++)
        functiondefs.elementAt(i).Accept(this);
    
    return null;
}