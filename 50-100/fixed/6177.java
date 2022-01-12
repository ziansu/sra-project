public void callApi(java.lang.String toBeSearchedWord) {
    com.example.ripu.mydictionary.URLRetriever urlRetriever = new com.example.ripu.mydictionary.URLRetriever();
    com.example.ripu.mydictionary.JsonUtil util = new com.example.ripu.mydictionary.JsonUtil();
    java.lang.String app_id = APIConstants.app_id;
    java.lang.String app_key = APIConstants.app_key;
    java.lang.String uri = APIConstants.uri;
    uri = uri + toBeSearchedWord;
    android.util.Log.d(com.example.ripu.mydictionary.MainActivity.TAG, toBeSearchedWord);
    java.lang.String stringFromUrlRetriever = urlRetriever.objectForWordRetriever(uri, app_id, app_key);
    java.lang.Object obj = util.stringToJson(stringFromUrlRetriever);
    com.example.ripu.api.RetrieveEntry entry = ((com.example.ripu.api.RetrieveEntry) (util.objectToClass(obj)));
}