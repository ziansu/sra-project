@java.lang.Override
public void onOpen(com.google.appinventor.client.explorer.OpenEvent<com.google.appinventor.client.explorer.TreeItem> event) {
    com.google.appinventor.client.explorer.TreeItem treeItem = event.getTarget();
    if (treeItem != null) {
        java.lang.Object userObject = treeItem.getUserObject();
        if (userObject instanceof com.google.appinventor.client.explorer.SourceStructureExplorerItem) {
            com.google.appinventor.client.explorer.SourceStructureExplorerItem item = ((com.google.appinventor.client.explorer.SourceStructureExplorerItem) (userObject));
            item.onStateChange(true);
        }
    }
}