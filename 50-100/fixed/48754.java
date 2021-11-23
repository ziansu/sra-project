private ExprElement.Type writeConstantType(wywasm.Type type) {
    if (type.equals(Type.T_INT)) {
        return factory.createExprType(Expr.INT);
    }else
        if (type.equals(Type.T_BOOL)) {
            return factory.createExprType(Expr.INT);
        }else
            if (type.equals(Type.T_ARRAY_ANY)) {
                return factory.createExprType(Expr.INT);
            }else
                if (type instanceof wywasm.Type.Array) {
                    return factory.createExprType(Expr.INT);
                }
            
        
    
    java.lang.System.out.println(type);
    throw new java.lang.Error("Some error to be decided later.");
}