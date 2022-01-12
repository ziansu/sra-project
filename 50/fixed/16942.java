private void getItems() {
    mmarquee.automation.condition.Condition condition = this.createTrueCondition();
    java.util.List<mmarquee.automation.AutomationElement> collection = this.findAll(TreeScope.TreeScope_Children, condition);
    mmarquee.automation.AutomationElement element = collection.get(0);
    java.lang.String name = element.currentName();
}