@java.lang.Override
public com.google.gson.JsonObject getCloudStorageMetadata() {
    com.google.gson.JsonObject result;
    com.stnetix.ariaddna.externalcloudapi.implementation.Request request;
    request = getRequest(com.stnetix.ariaddna.externalcloudapi.implementation.DISK_PATH, tempAccessToken);
    result = sendRequest(client, request);
    return result;
}