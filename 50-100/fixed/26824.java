private void addContentRules(java.util.List<org.matrix.androidsdk.rest.model.bingrules.ContentRule> rules) {
    if (null != rules) {
        for (org.matrix.androidsdk.rest.model.bingrules.ContentRule rule : rules) {
            org.matrix.androidsdk.rest.model.bingrules.EventMatchCondition condition = new org.matrix.androidsdk.rest.model.bingrules.EventMatchCondition();
            condition.kind = org.matrix.androidsdk.rest.model.bingrules.Condition.KIND_EVENT_MATCH;
            condition.key = "content.body";
            condition.pattern = rule.pattern;
            rule.addCondition(condition);
            mRules.add(rule);
        }
    }
}