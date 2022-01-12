@java.lang.Override
public void onClose(com.google.appinventor.client.explorer.CloseEvent<com.google.appinventor.client.explorer.TreeItem> event) {
    com.google.appinventor.client.explorer.TreeItem treeItem = event.getTarget();
    if (treeItem != null) {
        box.flyoutOpen(false);
        java.lang.Object userObject = treeItem.getUserObject();
        if (userObject instanceof com.google.appinventor.client.explorer.SourceStructureExplorerItem) {
            com.google.appinventor.client.explorer.SourceStructureExplorerItem item = ((com.google.appinventor.client.explorer.SourceStructureExplorerItem) (userObject));
            item.onStateChange(false);
        }
    }
}