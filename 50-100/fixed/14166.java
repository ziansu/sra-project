private void checkFunction(java.lang.String function, java.lang.String classCode) {
    com.jetbrains.jetpad.vclang.naming.NamespaceMember member = typeCheckClass(classCode);
    com.jetbrains.jetpad.vclang.term.definition.FunctionDefinition fun = ((com.jetbrains.jetpad.vclang.term.definition.FunctionDefinition) (member.namespace.getMember(function).definition));
    ok(fun.getElimTree(), fun.getResultType());
}