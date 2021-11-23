@retrofit.http.GET(value = PDAPIConfig.PD_FEEDS_PATH)
void getFeeds(retrofit.Callback<java.util.ArrayList<com.popdeem.sdk.core.model.PDFeed>> callback);