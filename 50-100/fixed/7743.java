@java.lang.Override
public org.bds.lang.Type returnType(org.bds.scope.Scope scope) {
    if ((returnType) != null)
        return returnType;
    
    expr.returnType(scope);
    if (expr.canCastInt())
        returnType = Type.INT;
    else
        if (expr.canCastReal())
            returnType = Type.REAL;
        else
            return null;
        
    
    return returnType;
}