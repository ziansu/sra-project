private javax.faces.component.UIComponent getSelectBooleanCheckboxLabelFacetChild(javax.faces.component.UIComponent uiComponent) {
    javax.faces.component.UIComponent labelFacet = uiComponent.getFacet("label");
    javax.faces.component.UIComponent selectBooleanCheckboxChild = null;
    if (labelFacet != null) {
        if (labelFacet instanceof com.liferay.faces.alloy.component.selectbooleancheckbox.SelectBooleanCheckbox) {
            selectBooleanCheckboxChild = labelFacet;
        }else
            if ((labelFacet.getChildCount()) > 0) {
                java.util.List<javax.faces.component.UIComponent> children = labelFacet.getChildren();
                for (javax.faces.component.UIComponent child : children) {
                    selectBooleanCheckboxChild = child;
                    break;
                }
            }
        
    }
    return selectBooleanCheckboxChild;
}