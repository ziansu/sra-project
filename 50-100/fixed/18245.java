public void resetSort() {
    final javax.el.ValueExpression origSortBy = ((javax.el.ValueExpression) (getStateHelper().get(com.lassitercg.faces.components.sheet.Sheet.PropertyKeys.origSortBy)));
    this.setSortByValueExpression(origSortBy);
    final java.lang.String origSortOrder = ((java.lang.String) (getStateHelper().get(com.lassitercg.faces.components.sheet.Sheet.PropertyKeys.origSortOrder)));
    if (origSortOrder != null) {
        setSortOrder(origSortOrder);
    }
}