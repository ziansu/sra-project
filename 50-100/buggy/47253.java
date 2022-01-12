org.eclipse.kura.web.shared.model.GwtConfigComponent getUpdatedConfiguration() {
    java.util.Iterator<com.google.gwt.user.client.ui.Widget> it = fields.iterator();
    while (it.hasNext()) {
        com.google.gwt.user.client.ui.Widget w = it.next();
        if (w instanceof org.gwtbootstrap3.client.ui.FormGroup) {
            org.gwtbootstrap3.client.ui.FormGroup fg = ((org.gwtbootstrap3.client.ui.FormGroup) (w));
            fillUpdatedConfiguration(fg);
        }
    } 
    return m_configurableComponent;
}