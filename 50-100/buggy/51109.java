public static java.lang.Object getParent(java.lang.Object treeOrTreeItem) {
    if (!(treeOrTreeItem instanceof org.eclipse.swt.widgets.TreeItem)) {
        return null;
    }
    org.eclipse.swt.widgets.TreeItem item = ((org.eclipse.swt.widgets.TreeItem) (treeOrTreeItem));
    org.eclipse.swt.widgets.TreeItem parentItem = item.getParentItem();
    if (parentItem != null) {
        return null;
    }
    return item.getParent();
}