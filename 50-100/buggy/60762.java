@java.lang.Override
public java.lang.String createDocument(java.lang.String repositoryId, org.apache.chemistry.opencmis.commons.data.Properties properties, java.lang.String folderId, org.apache.chemistry.opencmis.commons.data.ContentStream contentStream, org.apache.chemistry.opencmis.commons.enums.VersioningState versioningState, java.util.List<java.lang.String> policies, org.apache.chemistry.opencmis.commons.data.Acl addAces, org.apache.chemistry.opencmis.commons.data.Acl removeAces, org.apache.chemistry.opencmis.commons.data.ExtensionsData extension) {
    return this.getRepository(repositoryId).createDocument(folderId, properties, contentStream.getStream());
}