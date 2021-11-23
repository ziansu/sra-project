public java.lang.String createFolder(java.lang.String folderId, org.apache.chemistry.opencmis.commons.data.Properties properties) {
    java.lang.String newFolderName = this.getStringProperty(properties, PropertyIds.NAME);
    se.simonsoft.cms.item.CmsItemPath newFolderPath = new se.simonsoft.cms.item.CmsItemPath(folderId).append(newFolderName);
    this.runChange(new se.simonsoft.cms.item.commit.FolderAdd(newFolderPath));
    return newFolderPath.getPath();
}