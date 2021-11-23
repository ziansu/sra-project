private org.bahmni.module.dataintegrity.rule.RuleDefn<T> getJavaRuleInstance(java.lang.String ruleCode) {
    org.bahmni.module.dataintegrity.rule.RuleDefn<T> ruleDefn = null;
    try {
        java.lang.Class<?> ruleClass = org.openmrs.util.OpenmrsClassLoader.getInstance().loadClass(ruleCode, false);
        java.lang.Object o = ruleClass.newInstance();
        ruleDefn = ((org.bahmni.module.dataintegrity.rule.RuleDefn<T>) (o));
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return ruleDefn;
}