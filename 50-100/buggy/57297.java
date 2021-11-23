public org.openl.binding.IBoundNode bind(org.openl.rules.lang.xls.syntax.XlsModuleSyntaxNode moduleNode, org.openl.OpenL openl, org.openl.binding.IBindingContext bindingContext) {
    org.openl.rules.lang.xls.binding.XlsModuleOpenClass moduleOpenClass = createModuleOpenClass(moduleNode, openl, getModuleDatabase(), null, bindingContext);
    org.openl.rules.binding.RulesModuleBindingContext moduleContext = createRulesBindingContext(bindingContext, moduleOpenClass);
    return processBinding(moduleNode, openl, moduleContext, moduleOpenClass);
}