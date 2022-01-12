@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    picture = edu.uml.cs.isense.riverwalk.Pictures.getOutputMediaFile(edu.uml.cs.isense.riverwalk.Pictures.MEDIA_TYPE_IMAGE);
    if ((picture) == null) {
        android.util.Log.d("CameraMain", "picture is null");
        return ;
    }
    android.util.Log.d("CameraMain", "PictureCallback");
    try {
        java.io.FileOutputStream fos = new java.io.FileOutputStream(picture);
        fos.write(data);
        fos.close();
    } catch (java.io.IOException e) {
        android.util.Log.e("onPictureTaken in main", "failed to save picture");
    }
}