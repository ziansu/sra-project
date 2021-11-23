private static void fillButtonProperties(com.uipro.entity.UiproRequest reqObj, com.vaadin.ui.Component button) {
    java.lang.String buttonLabel = reqObj.getElementValue();
    if ((buttonLabel != null) && ((buttonLabel.length()) > 0)) {
        button.setCaption(buttonLabel);
        button.setId(reqObj.getElementId());
        ((com.vaadin.ui.AbstractComponent) (button)).setResponsive(true);
        button.setEnabled(true);
        button.setVisible(true);
    }
}