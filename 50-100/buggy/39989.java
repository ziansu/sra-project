@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    int angleToRotate = getRotationAngle(camIdx);
    android.graphics.Bitmap orignalImage = android.graphics.BitmapFactory.decodeByteArray(data, 0, data.length);
    android.graphics.Bitmap bitmapImage = com.sucho.camrena.PhotoActivity.rotate(orignalImage, angleToRotate);
    imageFile = com.sucho.camrena.PhotoActivity.getImageFile();
    if ((imageFile) == null) {
        return ;
    }
    new com.sucho.camrena.PhotoActivity.imageSave().execute(bitmapImage);
    camera.startPreview();
    photoCapture.setVisibility(View.VISIBLE);
}