public void checkFolders(java.util.Set<java.lang.String> folders) {
    if (folders != null) {
        for (java.lang.String folder : folders) {
            org.opencms.gwt.client.ui.tree.CmsLazyTreeItem item = m_itemsByPath.get(folder);
            if (item != null) {
                item.getCheckBox().setChecked(true);
            }
        }
    }
}