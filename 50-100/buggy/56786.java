@java.lang.Override
public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent event) {
    setDirty(true);
    org.gwtbootstrap3.client.ui.InlineRadio box = ((org.gwtbootstrap3.client.ui.InlineRadio) (event.getSource()));
    if (box.getValue()) {
        param.setValue(java.lang.String.valueOf(true));
    }
}