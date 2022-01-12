public void post(java.lang.String url, java.lang.String json) {
    try {
        java.lang.System.out.println(json);
        io.proxylabs.spawning_pool.http.RequestBody body = io.proxylabs.spawning_pool.http.RequestBody.create(io.proxylabs.spawning_pool.http.HttpService.JSON, json);
        io.proxylabs.spawning_pool.http.Request request = new io.proxylabs.spawning_pool.http.Request.Builder().url(url).header("Authorization", ("key=" + (properties.getProperty(io.proxylabs.spawning_pool.http.HttpService.PROPERTIES_FCM_SERVER_KEY)))).post(body).build();
        io.proxylabs.spawning_pool.http.Response response = client.newCall(request).execute();
    } catch (java.io.IOException e) {
    }
}