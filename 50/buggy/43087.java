private com.visenze.visearch.android.ResultList getResult(java.lang.String jsonResponse) {
    com.visenze.visearch.android.ResultList resultList = null;
    try {
        resultList = com.visenze.visearch.android.util.ResponseParser.parseResult(jsonResponse);
    } catch (com.visenze.visearch.android.ViSearchException exception) {
        exception.printStackTrace();
    }
    return resultList;
}