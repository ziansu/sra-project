private void addSenderRules(java.util.List<org.matrix.androidsdk.rest.model.bingrules.BingRule> rules) {
    for (org.matrix.androidsdk.rest.model.bingrules.BingRule rule : rules) {
        org.matrix.androidsdk.rest.model.bingrules.EventMatchCondition condition = new org.matrix.androidsdk.rest.model.bingrules.EventMatchCondition();
        condition.kind = org.matrix.androidsdk.rest.model.bingrules.Condition.KIND_EVENT_MATCH;
        condition.key = "user_id";
        condition.pattern = rule.ruleId;
        rule.addCondition(condition);
        mRules.add(rule);
    }
}