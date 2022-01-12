@java.lang.Override
public org.eclipse.smarthome.automation.Rule add(org.eclipse.smarthome.automation.Rule rule) {
    if (rule == null) {
        throw new java.lang.IllegalArgumentException("The added rule must not be null!");
    }
    java.lang.String rUID = rule.getUID();
    org.eclipse.smarthome.automation.Rule ruleWithUID = (rUID == null) ? ruleEngine.initRuleId(rule) : rule;
    org.eclipse.smarthome.automation.Rule r1 = resolveTemplate(ruleWithUID);
    if (r1 != null) {
        super.add(r1);
        ruleWithUID = r1;
    }else {
        super.add(ruleWithUID);
    }
    return ruleWithUID;
}