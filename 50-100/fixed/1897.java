private org.openl.binding.IBoundNode bindWithDependencies(org.openl.rules.lang.xls.syntax.XlsModuleSyntaxNode moduleNode, org.openl.OpenL openl, org.openl.binding.IBindingContext bindingContext, java.util.Set<org.openl.dependency.CompiledDependency> moduleDependencies) {
    org.openl.rules.lang.xls.binding.XlsModuleOpenClass moduleOpenClass = createModuleOpenClass(moduleNode, openl, getModuleDatabase(), moduleDependencies, bindingContext);
    org.openl.rules.binding.RulesModuleBindingContext moduleContext = populateBindingContextWithDependencies(moduleNode, bindingContext, moduleDependencies, moduleOpenClass);
    return processBinding(moduleNode, openl, moduleContext, moduleOpenClass, bindingContext);
}