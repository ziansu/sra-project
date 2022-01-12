public void uncheckFolders(java.util.Collection<java.lang.String> folders) {
    for (java.lang.String folder : folders) {
        org.opencms.gwt.client.ui.tree.CmsLazyTreeItem item = m_itemsByPath.get(folder);
        if (item != null) {
            item.getCheckBox().setChecked(false);
        }
    }
}