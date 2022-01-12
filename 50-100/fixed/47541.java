@java.lang.Override
public java.lang.Void preProcessResponse(com.microsoft.azure.storage.file.CloudFileShare share, com.microsoft.azure.storage.file.CloudFileClient client, com.microsoft.azure.storage.OperationContext context) throws java.lang.Exception {
    if ((this.getResult().getStatusCode()) != (java.net.HttpURLConnection.HTTP_OK)) {
        this.setNonExceptionedRetryableFailure(true);
        return null;
    }
    final com.microsoft.azure.storage.file.FileShareAttributes attributes = com.microsoft.azure.storage.file.FileResponse.getFileShareAttributes(this.getConnection(), client.isUsePathStyleUris());
    share.metadata = attributes.getMetadata();
    share.properties = attributes.getProperties();
    return null;
}