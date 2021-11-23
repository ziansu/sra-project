private void validateConstraints() {
    org.zkoss.zul.Tab selectedTab = personalDataTab;
    try {
        validatePersonalDataTab();
        selectedTab = assignedCriteriaTab;
        validateAssignedCriteriaTab();
        selectedTab = costCategoryAssignmentTab;
        validateCostCategoryAssigmentTab();
    } catch (org.zkoss.zk.ui.WrongValueException e) {
        selectedTab.setSelected(true);
        throw e;
    }
}