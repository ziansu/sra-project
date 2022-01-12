@java.lang.Override
public void HandleTopNewsIds(java.lang.String data) {
    android.util.Log.i("Info", data);
    try {
        org.json.JSONArray jsonArray = new org.json.JSONArray(data);
        for (int i = 0; i < (jsonArray.length()); i++) {
            topNewsArray.add(jsonArray.getString(i));
        }
        getArticleInfo(30);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}