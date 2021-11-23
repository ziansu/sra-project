public <T> void addToRequestQueue(com.android.volley.Request<T> req) {
    req.setTag(com.raxdenstudios.http.HttpAsyncClient.TAG);
    getRequestQueue().add(req);
}