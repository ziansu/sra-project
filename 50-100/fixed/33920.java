private void launchExternalIntent() {
    android.content.Intent i = new android.content.Intent("android.intent.action.VIEW");
    java.io.File f = new java.io.File((((instanceFolder) + (java.io.File.separator)) + (binaryName)));
    i.setDataAndType(android.net.Uri.fromFile(f), "video/*");
    try {
        getContext().startActivity(i);
    } catch (android.content.ActivityNotFoundException e) {
        org.odk.collect.android.utilities.ToastUtils.showShortToast(getContext().getString(R.string.activity_not_found, "video video"));
    }
}