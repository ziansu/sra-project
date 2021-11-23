public com.java.a35.newsapp.JSONObject getImages(java.lang.String queryKeyword) throws com.java.a35.newsapp.JSONException, java.io.IOException {
    java.lang.String queryString = java.lang.String.format("q=%s&mkt=%s&count=%d", java.net.URLEncoder.encode(queryKeyword, "UTF-8"), com.java.a35.newsapp.PictureAPI.SEARCH_PLACE, com.java.a35.newsapp.PictureAPI.IMAGE_NUM);
    com.java.a35.newsapp.JSONObject src = cachedGet("/bing/v7.0/images/search", queryString);
    com.java.a35.newsapp.JSONArray imagesArray = src.getJSONArray("value");
    return imagesArray.getJSONObject(0);
}