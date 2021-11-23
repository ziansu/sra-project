@java.lang.Override
public void onChange(final com.google.gwt.event.dom.client.ChangeEvent event) {
    this.setDirty(true);
    final org.gwtbootstrap3.client.ui.ListBox box = ((org.gwtbootstrap3.client.ui.ListBox) (event.getSource()));
    param.setValue(box.getSelectedItemText());
}