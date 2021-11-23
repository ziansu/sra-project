public void get(java.lang.String url, final eu.marcocattaneo.stargazerstest.business.http.RequestCallback callback) {
    eu.marcocattaneo.stargazerstest.business.http.HttpRequest.CustomStringRequest stringRequest = new eu.marcocattaneo.stargazerstest.business.http.HttpRequest.CustomStringRequest(Request.Method.GET, url, new eu.marcocattaneo.stargazerstest.business.http.HttpRequest.CustomStringRequest.OnSuccess() {
        @java.lang.Override
        public void onResponse(int status, java.lang.String response) {
            callback.onResult(status, response);
        }
    }, new com.android.volley.Response.ErrorListener() {
        @java.lang.Override
        public void onErrorResponse(com.android.volley.VolleyError error) {
            callback.onError(error);
        }
    });
    mQueue.add(stringRequest);
}