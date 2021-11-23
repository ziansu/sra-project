public static java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> getComplexObject(java.lang.String argKey, android.content.SharedPreferences preferences) {
    java.lang.String sobj = preferences.getString(argKey, "");
    java.lang.reflect.Type typeOfHashMap = new com.google.gson.reflect.TypeToken<java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>>() {    }.getType();
    if (sobj.equals(""))
        return new java.util.HashMap<>();
    else
        return new com.google.gson.Gson().fromJson(sobj, typeOfHashMap);
    
}