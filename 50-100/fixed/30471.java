public void initializeSettings() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        if (Settings.System.canWrite(android.content.Context)) {
        }else {
            android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_MANAGE_WRITE_SETTINGS);
            intent.setData(android.net.Uri.parse(("package:" + (this.cordova.getActivity().getPackageName()))));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            cordova.getActivity().startActivity(intent);
        }
    }
}