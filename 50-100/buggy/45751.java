static void sendFileToCloud(com.stnetix.ariaddna.externalcloudapi.implementation.OkHttpClient client, java.lang.String href, java.io.File path) {
    com.stnetix.ariaddna.externalcloudapi.implementation.Response response;
    try {
        com.stnetix.ariaddna.externalcloudapi.implementation.Request request = new com.stnetix.ariaddna.externalcloudapi.implementation.Request.Builder().url(href).put(com.stnetix.ariaddna.externalcloudapi.implementation.RequestBody.create(MediaTypes.JPG.getType(), path)).build();
        response = client.newCall(request).execute();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}