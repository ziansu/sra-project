public void release() {
    scheduleRuleRegistry.setAssistantLocal(null);
    transletRuleRegistry.setAssistantLocal(null);
    templateRuleRegistry.setAssistantLocal(null);
    objectStack = null;
    settings = null;
    environmentRules = null;
    typeAliases = null;
    assistantLocal = null;
    if ((environment) != null) {
        aspectRuleRegistry = null;
        beanRuleRegistry = null;
        scheduleRuleRegistry = null;
        transletRuleRegistry = null;
        templateRuleRegistry = null;
        beanReferenceInspector = null;
        com.aspectran.core.util.BeanDescriptor.clearCache();
        com.aspectran.core.util.MethodUtils.clearCache();
        com.aspectran.core.util.PropertiesLoaderUtils.clearCache();
    }
}