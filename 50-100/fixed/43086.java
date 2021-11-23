public static void init(android.content.Context context) {
    android.content.SharedPreferences sharedPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String json = sharedPrefs.getString(com.securityconfirm.layout.model.SecurityContext.USERLIST_TAG, null);
    java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.List<com.securityconfirm.layout.model.Account>>() {    }.getType();
    com.securityconfirm.layout.model.SecurityContext.userList = gson.fromJson(json, type);
    if ((com.securityconfirm.layout.model.SecurityContext.userList) == null) {
        com.securityconfirm.layout.model.SecurityContext.userList = new java.util.ArrayList<>();
    }
}