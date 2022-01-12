@java.lang.Override
public void onClick(android.view.View view) {
    if ((positiveListener) == null) {
        android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        android.net.Uri uri = android.net.Uri.fromParts("package", context.getPackageName(), null);
        intent.setData(uri);
        context.startActivity(intent);
        dismiss();
    }else {
        positiveListener.onClick(this, DialogInterface.BUTTON_POSITIVE);
    }
}