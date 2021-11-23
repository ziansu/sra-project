@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    referenceType.getRange().addAll(dialog.getFormClassIds());
    setReferenceListItems(referenceType);
}