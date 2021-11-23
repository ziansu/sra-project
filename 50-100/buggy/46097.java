@java.lang.Override
public com.kineticdata.filehub.adapter.Document getDocument(java.lang.String path) {
    path = getFullPath(path);
    com.kineticdata.filehub.adapter.Document result;
    try (org.jclouds.blobstore.BlobStoreContext context = buildBlobStoreContext()) {
        org.jclouds.blobstore.BlobStore blobStore = context.getBlobStore();
        org.jclouds.blobstore.domain.Blob blob = blobStore.getBlob(getContainer(), path);
        result = new com.kineticdata.filehub.adapters.cloud.CloudDocument(path, blob);
    }
    return result;
}