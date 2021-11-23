@java.lang.Override
public void onPictureTaken(byte[] bytes, android.hardware.Camera camera) {
    android.util.Log.d(com.ci.marcopolo.TakePictureActivity.TAG, "onPictureTaken (jpeg)");
    android.graphics.Bitmap bitmapPicture = android.graphics.BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
    java.lang.String imagePath = (android.os.Environment.getExternalStorageDirectory().getAbsolutePath()) + (com.ci.marcopolo.TakePictureActivity.AUTOPOLO_IMAGE_FILENAME);
    saveImage(bitmapPicture, imagePath);
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.ci.marcopolo.EditPictureActivity.class);
    intent.putExtra(com.ci.marcopolo.TakePictureActivity.AUTOPOLO_IMAGE_STRING, imagePath);
    startActivityForResult(intent, com.ci.marcopolo.TakePictureActivity.EDIT_PICTURE);
}