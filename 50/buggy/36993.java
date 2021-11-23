private void startCamera() {
    android.content.Intent intentCamera = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    if ((intentCamera.resolveActivity(getPackageManager())) != null) {
        startActivityForResult(intentCamera, wwckl.projectmiki.activity.MainActivity.REQUEST_TAKE_PICTURE);
    }
    android.util.Log.e(wwckl.projectmiki.activity.MainActivity.LOG_TAG, "Unable to dispatch intent. No supported application available");
}