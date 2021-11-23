private java.lang.Class<?> typeInfferUnary(nez.ast.jcode.JCodeTree node) {
    java.lang.Class<?> nodeType = node.getTypedClass();
    if (nodeType == (int.class)) {
        return int.class;
    }else
        if (nodeType == (double.class)) {
            return double.class;
        }
    
    new java.lang.RuntimeException(("type error: " + node));
    return null;
}