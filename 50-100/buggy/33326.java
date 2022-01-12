public org.eclipse.jdt.internal.compiler.lookup.ModuleBinding resolve(org.eclipse.jdt.internal.compiler.lookup.Scope scope) {
    if ((scope != null) && ((this.binding = scope.environment().getModule(this.moduleName)) == null)) {
        scope.problemReporter().invalidModule(this);
    }
    return this.binding;
}