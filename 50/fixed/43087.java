private com.visenze.visearch.android.ResultList getResult(java.lang.String jsonResponse) {
    com.visenze.visearch.android.ResultList resultList = null;
    resultList = com.visenze.visearch.android.util.ResponseParser.parseResult(jsonResponse);
    return resultList;
}