public miniJava.ContextAnalyzer.Type visitArrayType(miniJava.ContextAnalyzer.ArrayType type, java.lang.Object arg) {
    type.eltType.visit(this, null);
    return type;
}