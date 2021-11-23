@java.lang.Override
public void deleteTool(java.lang.String toolId) {
    try {
        listStore.remove(listStore.findModelWithKey(toolId));
    } catch (com.google.gwt.event.shared.UmbrellaException umb) {
    }
}