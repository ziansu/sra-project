public java.lang.String visit(Visitor.FieldDecl stmt) {
    java.lang.String flag = ("  " + (stmt.getType().accept(this))) + " ";
    for (Visitor.IdName id : stmt.getListId()) {
        flag += id.accept(this);
        if ((id.getSize()) != null)
            flag += ("[" + (id.getSize())) + "]";
        
    }
    return flag += ";\n";
}