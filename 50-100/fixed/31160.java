@java.lang.Override
public org.nuxeo.onedrive.client.OneDriveFile.Metadata getMetadata(org.nuxeo.onedrive.client.OneDriveExpand... expands) throws java.io.IOException {
    org.nuxeo.onedrive.client.QueryStringBuilder query = new org.nuxeo.onedrive.client.QueryStringBuilder().set("expand", expands);
    final java.net.URL url = getMetadataURL().build(getApi().getBaseURL(), query, getResourceIdentifier());
    org.nuxeo.onedrive.client.OneDriveJsonRequest request = new org.nuxeo.onedrive.client.OneDriveJsonRequest(url, "GET");
    org.nuxeo.onedrive.client.OneDriveJsonResponse response = request.sendRequest(getApi().getExecutor());
    return new org.nuxeo.onedrive.client.OneDriveFile.Metadata(response.getContent());
}