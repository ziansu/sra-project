public void StartActivity(java.lang.String packageName) {
    try {
        android.content.Intent intent = new android.content.Intent();
        android.content.pm.PackageManager packageManager = getPackageManager();
        intent = packageManager.getLaunchIntentForPackage(packageName);
        intent.setFlags((((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED)) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP)));
        startActivity(intent);
    } catch (java.lang.Exception e) {
        showErroDialog();
    }
}