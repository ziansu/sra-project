@java.lang.Override
public void onValueChange(final com.google.gwt.event.logical.shared.ValueChangeEvent event) {
    this.setDirty(true);
    final org.gwtbootstrap3.client.ui.InlineRadio box = ((org.gwtbootstrap3.client.ui.InlineRadio) (event.getSource()));
    if (box.getValue()) {
        param.setValue(java.lang.String.valueOf(false));
    }
}