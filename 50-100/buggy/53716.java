@java.lang.Override
protected void onCreate(android.os.Bundle outState) {
    super.onCreate(outState);
    setContentView(R.layout.watchlist_item_view);
    android.content.Intent receiveData = getIntent();
    java.lang.String receivedTitle = receiveData.getStringExtra("title");
    input = receivedTitle;
    getJsonFromUrl(input);
    try {
        extractJson(jsonLongPlot);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    findViews();
    setContent();
}