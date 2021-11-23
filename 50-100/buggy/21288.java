private com.android.volley.toolbox.JsonObjectRequest createRecentItemRequest(java.lang.String url, com.example.wenqixian.myfirstapp.RecentItemsActivity.SectionsPagerAdapter adapter) {
    com.android.volley.Response.Listener<org.json.JSONObject> listen = new com.example.wenqixian.myfirstapp.RecentItemsActivity.newListners<org.json.JSONObject>(adapter);
    com.example.wenqixian.myfirstapp.RecentItemsActivity.jsObjRequest = new com.android.volley.toolbox.JsonObjectRequest(Request.Method.GET, url, "", listen, new com.android.volley.Response.ErrorListener() {
        @java.lang.Override
        public void onErrorResponse(com.android.volley.VolleyError error) {
            if (error != null) {
                android.util.Log.e("RecentItemsActivity", error.getMessage());
            }
        }
    });
    return com.example.wenqixian.myfirstapp.RecentItemsActivity.jsObjRequest;
}