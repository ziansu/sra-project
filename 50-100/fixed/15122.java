private void getDetails(java.lang.String imdbID) {
    java.lang.String url = java.lang.String.format(com.example.vineetpatil.moviesearch.SearchFragment.detailsUrl, imdbID);
    com.example.vineetpatil.moviesearch.GsonRequest<com.example.vineetpatil.moviesearch.TitleRecord> titleRecordGsonRequest = new com.example.vineetpatil.moviesearch.GsonRequest(url, com.example.vineetpatil.moviesearch.TitleRecord.class, null, new com.example.vineetpatil.moviesearch.SearchFragment.TitleRecordListener(), new com.example.vineetpatil.moviesearch.SearchFragment.TitleRecordErrorListener());
    titleRecordGsonRequest.setTag(com.example.vineetpatil.moviesearch.SearchFragment.TAG);
    requestQueue.add(titleRecordGsonRequest);
}