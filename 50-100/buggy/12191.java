@java.lang.Override
public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent<java.lang.String> event) {
    setDirty(true);
    org.gwtbootstrap3.client.ui.TextBox box = ((org.gwtbootstrap3.client.ui.TextBox) (event.getSource()));
    org.gwtbootstrap3.client.ui.FormGroup group = ((org.gwtbootstrap3.client.ui.FormGroup) (box.getParent()));
    validate(param, box, group);
}