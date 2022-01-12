public java.util.List<com.jds.webapp.DataArticle> getListSavedArticle(java.util.List<com.jds.webapp.DataArticle> newList) {
    newList = new java.util.ArrayList<com.jds.webapp.DataArticle>();
    int size = _sharedPref.getInt("Status_size", 0);
    for (int i = 0; i < size; i++) {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = _sharedPref.getString(("Status_" + i), "");
        com.jds.webapp.DataArticle obj = gson.fromJson(json, com.jds.webapp.DataArticle.class);
        newList.add(obj);
    }
    return newList;
}