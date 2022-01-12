private org.eclipse.smarthome.automation.core.internal.RuntimeRule getRuleByTemplate(org.eclipse.smarthome.automation.core.internal.RuntimeRule rule) {
    java.lang.String ruleTemplateUID = rule.getTemplateUID();
    org.eclipse.smarthome.automation.template.RuleTemplate template = ((org.eclipse.smarthome.automation.template.RuleTemplate) (tManager.get(ruleTemplateUID)));
    if (template == null) {
        logger.debug((("Rule template '" + ruleTemplateUID) + "' does not exist."));
        return null;
    }else {
        org.eclipse.smarthome.automation.core.internal.RuntimeRule r1 = new org.eclipse.smarthome.automation.core.internal.RuntimeRule(rule.getUID(), template, rule.getConfiguration());
        return r1;
    }
}