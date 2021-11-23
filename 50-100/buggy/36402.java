@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    int rowIndex = baugruppeCollection.getCellForEvent(event).getRowIndex();
    baugruppeCollection.removeRow(rowIndex);
    int x = a - 1;
    com.google.gwt.user.client.Window.alert(("Gelöscht wird: " + (collectBaugruppen.get(a).getElement().getName())));
    listBoxBauteile.getElement().getElementsByTagName("option").getItem(x).removeAttribute("disabled");
    collectBaugruppen.remove(a);
}