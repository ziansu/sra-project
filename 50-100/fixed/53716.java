@java.lang.Override
protected void onCreate(android.os.Bundle outState) {
    super.onCreate(outState);
    setContentView(R.layout.watchlist_item_view);
    android.content.Intent receiveData = getIntent();
    input = receiveData.getStringExtra("title");
    getJsonFromUrl(input);
    try {
        extractJson(jsonLongPlot);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    findViews();
    setContent();
}