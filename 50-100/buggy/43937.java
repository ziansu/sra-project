@java.lang.Override
public void delRule(org.dataship.rule.Rule r) {
    org.dataship.rule.RuleManager.log.info("starting to delete rule: {}", r);
    org.dataship.rule.Rule rule = rules.get(r.getId());
    if (rule != null) {
        rule.stop();
    }
    org.dataship.rule.RuleManager.log.info("delete rule successfully: {}", r.getId());
}