@java.lang.Override
public void onValueChange(final com.google.gwt.event.logical.shared.ValueChangeEvent<java.lang.String> event) {
    this.setDirty(true);
    final org.gwtbootstrap3.client.ui.TextBox box = ((org.gwtbootstrap3.client.ui.TextBox) (event.getSource()));
    final org.gwtbootstrap3.client.ui.FormGroup group = ((org.gwtbootstrap3.client.ui.FormGroup) (box.getParent()));
    this.validate(param, box, group);
}