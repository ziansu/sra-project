public void addCondition(boolean logicalOperator) {
    if (logicalOperator) {
        condition.setLogicalOperator("and");
    }else {
        condition.setLogicalOperator("or");
    }
    condition.setId(((idCounter)++));
    conditionList.add(condition);
    condition = new pt.uc.dei.nobugssnackbar.model.mission.Condition();
}