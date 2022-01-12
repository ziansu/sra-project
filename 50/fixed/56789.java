private org.opends.server.types.AttributeType getSuperior() {
    java.lang.Object o = parent.getSelectedItem();
    if (org.opends.guitools.controlpanel.ui.NewAttributePanel.NO_PARENT.equals(o)) {
        return null;
    }
    return ((org.opends.server.types.AttributeType) (o));
}