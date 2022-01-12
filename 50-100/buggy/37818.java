@java.lang.Override
protected void V(java.util.HashMap<java.lang.String, Syntax.Init> declarationMap) {
    if (valid)
        return ;
    
    check((!(type.equals(Type.VOID))), "variable type can not be void");
    initial.V(declarationMap);
    check(initial.typeOf(declarationMap).equals(type), ((("wrong type initializer in declaration : " + (type)) + " ") + (name)));
    valid = true;
}