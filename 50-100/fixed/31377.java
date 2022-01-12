public void addCondition(boolean logicalOperator) {
    pt.uc.dei.nobugssnackbar.model.mission.Condition c = new pt.uc.dei.nobugssnackbar.model.mission.Condition();
    if (logicalOperator) {
        c.setLogicalOperator("and");
    }else {
        c.setLogicalOperator("or");
    }
    c.setId(((idCounter)++));
    conditionList.add(c);
}