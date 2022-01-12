@java.lang.Override
public void enterSimpleTypeName(com.j2swift.SimpleTypeNameContext ctx) {
    if (shouldSkipEnter())
        return ;
    
    int index = code.lastIndexOf("??");
    java.lang.String typeParams = code.substring((index + 2));
    code.append("init").append(typeParams).append('(');
    code.delete(index, code.length());
}