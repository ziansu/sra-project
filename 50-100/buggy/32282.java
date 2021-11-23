public void setListSavedArticle(java.util.List<com.jds.webapp.DataArticle> newList) {
    newList = new java.util.ArrayList<com.jds.webapp.DataArticle>();
    _sharedPrefEditor.putInt("Status_size", newList.size());
    for (int i = 0; i < (newList.size()); i++) {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String dataJson = gson.toJson(newList.get(i));
        _sharedPrefEditor.putString(("Status_" + i), dataJson);
    }
    _sharedPrefEditor.commit();
}