@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((com.facebook.AccessToken.getCurrentAccessToken()) != null) {
        android.content.Intent intent = new android.content.Intent(this, map.minimap.MainActivity.class);
        startActivity(intent);
    }
    com.facebook.appevents.AppEventsLogger.activateApp(this);
}