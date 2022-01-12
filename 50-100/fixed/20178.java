private void launchKioskApp(android.content.Context context, java.lang.String packageName) {
    android.content.Intent launchIntent = context.getApplicationContext().getPackageManager().getLaunchIntentForPackage(packageName);
    launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    if (launchIntent != null) {
        context.getApplicationContext().startActivity(launchIntent);
    }
}