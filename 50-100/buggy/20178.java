private void launchKioskApp(java.lang.String packageName) {
    android.content.Intent launchIntent = android.security.KeyStore.getApplicationContext().getPackageManager().getLaunchIntentForPackage(packageName);
    launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    if (launchIntent != null) {
        android.security.KeyStore.getApplicationContext().startActivity(launchIntent);
    }
}