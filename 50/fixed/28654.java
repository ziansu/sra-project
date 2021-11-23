@retrofit.http.GET(value = GiphyManager.URI_TRENDING)
void trending(@retrofit.http.Query(value = GiphyManager.PARAM_API_KEY)
java.lang.String key, @retrofit.http.Query(value = GiphyManager.PARAM_LIMIT)
java.lang.Integer limit, @retrofit.http.Query(value = GiphyManager.PARAM_OFFSET)
java.lang.Integer offset, retrofit.Callback<works.langley.giflive.api.model.GiphyResponse> callback);