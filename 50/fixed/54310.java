@java.lang.Override
public java.util.List<org.sapient.ruleservice.rule.RuleResult> runRules(final java.util.List<org.sapient.ruleservice.models.Trade> businessObjects, final java.util.List<java.lang.String> ruleIds) {
    return ruleEngineManager.applyRules(businessObjects, ruleIds);
}