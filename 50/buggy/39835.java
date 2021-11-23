@retrofit.http.GET(value = PDAPIConfig.PD_FEEDS_PATH)
void getFeeds(@retrofit.http.Query(value = "limit")
java.lang.String limit, retrofit.Callback<java.util.ArrayList<com.popdeem.sdk.core.model.PDFeed>> callback);