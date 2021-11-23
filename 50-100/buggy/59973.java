@java.lang.Override
public void onSuccess(int statusCode, com.weihua.newyorktimes.activities.cz[] headers, org.json.JSONObject response) {
    super.onSuccess(statusCode, headers, response);
    try {
        articles.clear();
        articles.addAll(parseArticles(response));
        articlesAdapter.notifyDataSetChanged();
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}