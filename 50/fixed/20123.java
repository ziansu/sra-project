@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    saveBtn.removeFromParent();
    cancelBtn.removeFromParent();
    fTable.removeCell(0, 6);
    fTable.removeCell(0, 5);
}