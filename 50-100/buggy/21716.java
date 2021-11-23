public static void userCatch(android.content.Context context, com.dorothy.v2ex.models.UserProfile userProfile) {
    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.dorothy.v2ex.utils.UserCache.USER_KEY, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString(com.dorothy.v2ex.utils.UserCache.PROFILE_KEY, new com.google.gson.Gson().toJson(userProfile));
}