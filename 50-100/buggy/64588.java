public java.lang.String createFolder(java.lang.String folderId, org.apache.chemistry.opencmis.commons.data.Properties properties) {
    se.simonsoft.cms.item.CmsItemId parentId = this.getItemId(folderId);
    java.lang.String newFolderName = this.getStringProperty(properties, PropertyIds.NAME);
    se.simonsoft.cms.item.CmsItemPath newFolderPath = parentId.getRelPath().append(newFolderName);
    this.runChange(new se.simonsoft.cms.item.commit.FolderAdd(newFolderPath));
    return newFolderPath.getPath();
}