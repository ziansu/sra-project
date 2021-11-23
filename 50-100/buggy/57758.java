@java.lang.Override
public com.google.gson.JsonObject copyFile(java.io.File from, java.io.File to) {
    com.google.gson.JsonObject result;
    com.stnetix.ariaddna.externalcloudapi.implementation.Request request;
    com.stnetix.ariaddna.externalcloudapi.implementation.HttpUrl copyPath = com.stnetix.ariaddna.externalcloudapi.implementation.COPY_PATH.newBuilder().addQueryParameter("from", ((APP_ROOT) + (from.getName()))).addQueryParameter("path", ((APP_ROOT) + (to.getPath()))).build();
    request = postRequest(copyPath, Util.EMPTY_REQUEST, tempAccessToken);
    result = sendRequest(client, request);
    return result;
}