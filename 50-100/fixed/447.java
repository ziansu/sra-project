@java.lang.Override
public void addActionListener(org.g6.laas.core.rule.action.RuleAction action, org.g6.laas.core.rule.action.ActionCondition condition) {
    java.util.List<org.g6.laas.core.rule.action.RuleAction> actionList = actions.get(condition);
    if (actionList == null) {
        actionList = new java.util.ArrayList<>();
        actionList.add(action);
        actions.put(condition, actionList);
    }else {
        actionList.add(action);
    }
}