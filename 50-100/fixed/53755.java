public void setType(org.ovirt.engine.ui.common.widget.panel.AlertPanel.Type type) {
    this.type = type;
    getWidget().setType(type.alertType);
    for (org.ovirt.engine.ui.common.widget.panel.AlertPanel.Type t : type.getDeclaringClass().getEnumConstants()) {
        icon.removeStyleName(t.iconStyleName);
    }
    icon.addStyleName(type.iconStyleName);
}