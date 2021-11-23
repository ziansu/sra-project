private com.liferay.faces.alloy.component.selectbooleancheckbox.SelectBooleanCheckbox getSelectBooleanCheckboxLabelFacetChild(javax.faces.component.UIComponent labelFacet) {
    com.liferay.faces.alloy.component.selectbooleancheckbox.SelectBooleanCheckbox selectBooleanCheckboxChild = null;
    if (labelFacet instanceof com.liferay.faces.alloy.component.selectbooleancheckbox.SelectBooleanCheckbox) {
        selectBooleanCheckboxChild = ((com.liferay.faces.alloy.component.selectbooleancheckbox.SelectBooleanCheckbox) (labelFacet));
    }else
        if ((labelFacet.getChildCount()) > 0) {
            java.util.List<javax.faces.component.UIComponent> children = labelFacet.getChildren();
            for (javax.faces.component.UIComponent child : children) {
                if (child instanceof com.liferay.faces.alloy.component.selectbooleancheckbox.SelectBooleanCheckbox) {
                    selectBooleanCheckboxChild = ((com.liferay.faces.alloy.component.selectbooleancheckbox.SelectBooleanCheckbox) (child));
                    break;
                }
            }
        }
    
    return selectBooleanCheckboxChild;
}