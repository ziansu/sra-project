private void addToCodeCompletionResult(org.quorum.symbols.VariableParameterCommonDescriptor variable, org.quorum.vm.interfaces.CodeCompletionResult result, java.lang.String classStaticKey, org.quorum.symbols.ClassDescriptor containingClass) {
    org.quorum.symbols.ClassDescriptor clazz = this.getSymbolTable().getClassDescriptor(classStaticKey);
    if (clazz == null) {
        if ((classStaticKey.length()) > 0) {
            org.quorum.symbols.ClassDescriptor validatedClassUse = containingClass.getValidatedClassUse(classStaticKey);
            clazz = validatedClassUse;
        }
    }
    addClassToResult(variable, null, result, clazz, false, null);
}