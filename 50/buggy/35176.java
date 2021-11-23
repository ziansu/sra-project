public com.java.a35.newsapp.JSONObject searchAllNews(java.lang.String query) throws com.java.a35.newsapp.JSONException, java.io.IOException {
    return searchNews(query, 1, com.java.a35.newsapp.API.DEFAULT_PAGE_SIZE);
}