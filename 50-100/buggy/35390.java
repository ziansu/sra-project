public void put(minijava.node.TId id, minijava.node.PType retType, java.util.LinkedList<minijava.node.PFormal> formals, java.util.LinkedList<minijava.node.PVarDecl> locals) throws java.lang.Exception {
    java.lang.String name = id.getText();
    if (table.containsKey(name)) {
        java.lang.String msg = (name + " redeclared on line ") + (id.getLine());
        throw new symtable.MethodClashException(msg);
    }
    table.put(name, new symtable.MethodInfo(retType, name, formals, locals));
}