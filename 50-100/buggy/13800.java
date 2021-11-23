public static java.lang.String getAccessToken(android.content.Context context) {
    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(LoginActivity.DRIBLE_MEM, Context.MODE_PRIVATE);
    java.lang.String access_token = sharedPreferences.getString(LoginActivity.DRIBLE_TOKEN_FIELD, null);
    if (android.text.TextUtils.isEmpty(access_token)) {
        android.content.Intent intent = new android.content.Intent(context, com.tuesda.watch.activities.LoginActivity.class);
        intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
        context.startActivity(intent);
    }
    return access_token;
}