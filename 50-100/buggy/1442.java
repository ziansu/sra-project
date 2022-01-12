private java.util.List<com.example.ckrao.myapplication.Model.MoreCityModel> getDataFromList(java.lang.String tag) {
    java.util.List<com.example.ckrao.myapplication.Model.MoreCityModel> models = new java.util.ArrayList<>();
    java.lang.String strJson = android.preference.PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString(tag, null);
    if (strJson == null) {
        return models;
    }
    com.google.gson.Gson gson = new com.google.gson.Gson();
    models = gson.fromJson(strJson, new com.google.gson.reflect.TypeToken<java.util.List<com.example.ckrao.myapplication.Model.MoreCityModel>>() {    }.getType());
    return models;
}