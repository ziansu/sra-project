@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    int rowIndex = baugruppeCollection.getCellForEvent(event).getRowIndex();
    baugruppeCollection.removeRow(rowIndex);
    com.google.gwt.user.client.Window.alert(("Gelöscht wird: " + (collectBaugruppen.get(a).getElement().getName())));
    listBoxBauteile.getElement().getElementsByTagName("option").getItem(a).removeAttribute("disabled");
    collectBaugruppen.remove(a);
}