public void createAndUpdateUri(int idTvShow, int seasonNumber) {
    if ((mContext) != null) {
        final android.net.Uri BASE_URL_API_SEARCH = android.net.Uri.parse(mContext.getString(R.string.url_search_seasons, idTvShow, seasonNumber));
        final java.lang.String API_KEY_THEMOVIEDBKEY = br.com.adley.myseriesproject.library.AppConsts.API_KEY_LABEL;
        final java.lang.String API_KEY = br.com.adley.myseriesproject.library.Utils.getApiKey(mContext);
        java.util.HashMap<java.lang.String, java.lang.String> queryParams = new java.util.HashMap<>();
        queryParams.put(API_KEY_THEMOVIEDBKEY, API_KEY);
        mDestinationUri = br.com.adley.myseriesproject.library.Utils.appendUri(BASE_URL_API_SEARCH, queryParams);
    }
}