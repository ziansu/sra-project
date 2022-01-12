public java.lang.String createDocument(java.lang.String folderId, org.apache.chemistry.opencmis.commons.data.Properties properties, java.io.InputStream inputStream) {
    se.simonsoft.cms.item.CmsItemId folder = this.getItemId(folderId);
    java.lang.String newItemName = this.getStringProperty(properties, PropertyIds.NAME);
    se.simonsoft.cms.item.CmsItemPath newItemPath = folder.getRelPath().append(newItemName);
    this.runChange(new se.simonsoft.cms.item.commit.FileAdd(newItemPath, inputStream));
    return newItemPath.getPath();
}