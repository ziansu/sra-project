org.eclipse.kura.web.shared.model.GwtConfigComponent getUpdatedConfiguration() {
    final java.util.Iterator<com.google.gwt.user.client.ui.Widget> it = this.fields.iterator();
    while (it.hasNext()) {
        final com.google.gwt.user.client.ui.Widget w = it.next();
        if (w instanceof org.gwtbootstrap3.client.ui.FormGroup) {
            final org.gwtbootstrap3.client.ui.FormGroup fg = ((org.gwtbootstrap3.client.ui.FormGroup) (w));
            this.fillUpdatedConfiguration(fg);
        }
    } 
    return this.m_configurableComponent;
}