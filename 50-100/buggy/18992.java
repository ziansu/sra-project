public java.lang.Object VisitFormals(ASTFormals formals) {
    if ((formals == null) || ((formals.size()) == 0))
        return null;
    
    for (i = 0; (i) < (formals.size()); (i)++) {
        formals.elementAt(i).Accept(this);
    }
    return null;
}