public java.lang.String createDocument(java.lang.String folderId, org.apache.chemistry.opencmis.commons.data.Properties properties, java.io.InputStream inputStream) {
    java.lang.String newItemName = this.getStringProperty(properties, PropertyIds.NAME);
    se.simonsoft.cms.item.CmsItemPath newItemPath = new se.simonsoft.cms.item.CmsItemPath(folderId).append(newItemName);
    this.runChange(new se.simonsoft.cms.item.commit.FileAdd(newItemPath, inputStream));
    return newItemPath.getPath();
}