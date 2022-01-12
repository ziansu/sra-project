public void putMondrianSchema(java.io.InputStream dataInputStream, com.sun.jersey.core.header.FormDataContentDisposition schemaFileInfo, java.lang.String catalogName, java.lang.String origCatalogName, java.lang.String datasourceName, boolean overwrite, boolean xmlaEnabledFlag, java.lang.String parameters, org.pentaho.platform.repository2.unified.webservices.RepositoryFileAclDto acl) throws java.lang.Exception, org.pentaho.platform.api.engine.PentahoAccessControlException, org.pentaho.platform.plugin.services.importer.PlatformImportException {
    accessValidation();
    java.lang.String fileName = schemaFileInfo.getFileName();
    processMondrianImport(dataInputStream, catalogName, origCatalogName, overwrite, xmlaEnabledFlag, parameters, fileName, acl);
}