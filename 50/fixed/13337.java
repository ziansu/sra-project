@java.lang.Override
public com.google.gson.JsonObject getCloudStorageMetadata() {
    request = getRequest(com.stnetix.ariaddna.externalcloudapi.implementation.DISK_PATH, tempAccessToken);
    result = sendRequest(client, request);
    return result;
}