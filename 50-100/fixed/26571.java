public void captureImage(android.app.Activity activity, com.esafirm.imagepicker.features.ImagePickerConfig config, int requestCode) {
    android.content.Context context = activity.getApplicationContext();
    android.content.Intent intent = cameraModule.getCameraIntent(activity, config);
    if (intent == null) {
        android.widget.Toast.makeText(context, context.getString(R.string.error_create_image_file), Toast.LENGTH_LONG).show();
        return ;
    }
    activity.startActivityForResult(intent, requestCode);
}