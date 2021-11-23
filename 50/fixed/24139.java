private static void forceMainActivityReload() {
    android.content.pm.PackageManager pm = cordova.getActivity().getPackageManager();
    com.plugin.gcm.Intent launchIntent = pm.getLaunchIntentForPackage(getApplicationContext().getPackageName());
    cordova.getActivity().startActivity(launchIntent);
}