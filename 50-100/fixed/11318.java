@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    eventRowIndex = itemTable.getCellForEvent(event).getRowIndex();
    itemDTO.setId(java.lang.Integer.parseInt(itemTable.getText(eventRowIndex, 0)));
    itemDTO.setName(itemTable.getText(eventRowIndex, 1));
    setItemId(java.lang.Integer.parseInt(itemTable.getText(eventRowIndex, 0)));
    controllerEditBtn.fireEvent(new com.google.gwt.event.dom.client.ClickEvent() {    });
}