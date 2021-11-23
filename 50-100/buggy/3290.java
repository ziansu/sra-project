private static void onLoginSuccess(android.app.Activity activity, java.lang.String accessToken) {
    android.content.SharedPreferences sharedPref = activity.getPreferences(Activity.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.putString("accessToken", accessToken);
    editor.commit();
    android.content.Intent intent = new android.content.Intent(com.mountainpeak.climbers.Utils.ctx, com.mountainpeak.climbers.MainActivity.class);
    activity.startActivity(intent);
    activity.finish();
}