public void request(java.lang.String coords) {
    java.lang.String apiUrl = buildUrl(coords);
    timber.log.Timber.d("URL: %s", apiUrl);
    com.android.volley.toolbox.JsonRequest<fr.free.nrw.commons.upload.MwVolleyApi.QueryResponse> request = new fr.free.nrw.commons.upload.MwVolleyApi.QueryRequest(apiUrl, new fr.free.nrw.commons.upload.MwVolleyApi.LogResponseListener<fr.free.nrw.commons.upload.MwVolleyApi.QueryResponse>(), new fr.free.nrw.commons.upload.MwVolleyApi.LogResponseErrorListener());
    getQueue().add(request);
}