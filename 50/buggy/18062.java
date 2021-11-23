protected org.eclipse.jdt.core.IModuleDescription resolveModule(char[] moduleName) {
    if ((this.openable) instanceof org.eclipse.jdt.internal.core.CompilationUnit) {
        org.eclipse.jdt.internal.core.NameLookup.Answer answer = this.nameLookup.findModule(new java.lang.String(moduleName));
        return answer.module;
    }
    return null;
}