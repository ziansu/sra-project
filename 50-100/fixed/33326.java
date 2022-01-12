public org.eclipse.jdt.internal.compiler.lookup.ModuleBinding resolve(org.eclipse.jdt.internal.compiler.lookup.Scope scope) {
    if ((scope == null) || ((this.binding) != null))
        return this.binding;
    
    return this.binding = scope.environment().getModule(this.moduleName);
}