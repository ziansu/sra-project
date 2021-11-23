public static java.util.List<com.kosbrother.mongmongwoo.model.Product> getCollectedList(android.content.Context context) {
    android.content.SharedPreferences settings = context.getSharedPreferences(com.kosbrother.mongmongwoo.mycollect.MyCollectManager.PREF_MY_COLLECT, Context.MODE_PRIVATE);
    java.util.List<com.kosbrother.mongmongwoo.model.Product> productList = new java.util.ArrayList<>();
    if (settings.contains(com.kosbrother.mongmongwoo.mycollect.MyCollectManager.PREF_STRING_COLLECT_LIST)) {
        java.lang.String myCollectedJsonString = settings.getString(com.kosbrother.mongmongwoo.mycollect.MyCollectManager.PREF_STRING_COLLECT_LIST, "");
        java.lang.reflect.Type listType = new com.google.gson.reflect.TypeToken<java.util.List<com.kosbrother.mongmongwoo.model.Product>>() {        }.getType();
        productList = new com.google.gson.Gson().fromJson(myCollectedJsonString, listType);
    }
    return productList;
}