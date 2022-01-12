@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent clickEvent) {
    rows.remove(uploadRow);
    fireValueChanged();
}