public static java.util.List<com.kosbrother.mongmongwoo.model.Product> getCollectedList(android.content.Context context) {
    android.content.SharedPreferences settings = context.getSharedPreferences(com.kosbrother.mongmongwoo.mycollect.MyCollectManager.PREF_MY_COLLECT, Context.MODE_PRIVATE);
    java.lang.String myCollectedJsonString = settings.getString(com.kosbrother.mongmongwoo.mycollect.MyCollectManager.PREF_STRING_COLLECT_LIST, "");
    if (myCollectedJsonString.isEmpty()) {
        return new java.util.ArrayList<>();
    }
    java.lang.reflect.Type listType = new com.google.gson.reflect.TypeToken<java.util.List<com.kosbrother.mongmongwoo.model.Product>>() {    }.getType();
    return new com.google.gson.Gson().fromJson(myCollectedJsonString, listType);
}