public void resetSort() {
    javax.el.ValueExpression origSortBy = ((javax.el.ValueExpression) (getStateHelper().get(com.lassitercg.faces.components.sheet.Sheet.PropertyKeys.origSortBy)));
    if (origSortBy != null)
        this.setSortByValueExpression(origSortBy);
    
    java.lang.String origSortOrder = ((java.lang.String) (getStateHelper().get(com.lassitercg.faces.components.sheet.Sheet.PropertyKeys.origSortOrder)));
    if (origSortOrder != null)
        setSortOrder(origSortOrder);
    
}