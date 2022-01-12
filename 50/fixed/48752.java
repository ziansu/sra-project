@java.lang.Override
public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
    setServerToDataSourceFromComboSelection();
    fireModificationEvent();
}