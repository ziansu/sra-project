public java.lang.Object VisitPrototype(ASTPrototype prototype) {
    if ((prototype.formals()) != null) {
        for (int i = 0; i < (prototype.formals().size()); i++)
            prototype.formals().elementAt(i).Accept(this);
        
    }
    return null;
}