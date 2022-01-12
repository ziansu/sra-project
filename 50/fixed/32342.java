public void onSingleTap() {
    android.content.Intent launchIntent = packagemanager.getLaunchIntentForPackage(sPrefs.getSelectedApp(1));
    startActivity(launchIntent);
}