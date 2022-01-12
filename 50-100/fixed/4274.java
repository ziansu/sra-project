private void cameraClick() {
    java.lang.String fileName = (java.lang.System.currentTimeMillis()) + ".png";
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(MediaStore.Images.Media.TITLE, fileName);
    mCapturedImageURI = com.android.angrybird.activity.BaseActivity.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
    android.content.Intent intent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(intent, com.android.angrybird.activity.BaseActivity.CAMERA_REQUEST);
}