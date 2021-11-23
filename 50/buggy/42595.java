@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    model.setSelectedItem(bookmark);
    model.setSelectedItems(java.util.Arrays.asList(bookmark));
    model.executeCommand(model.getEditCommand());
}