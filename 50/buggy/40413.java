public T createInvocation(java.lang.String left, java.lang.String op, AST.Invocation in, boolean isParamInvocation) {
    return createInvocation(left, op, in, null, isParamInvocation, CodeGeneratorJava.CodeGeneratorJava.INV_WRAP_NONE);
}