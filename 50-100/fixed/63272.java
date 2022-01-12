@java.lang.Override
public void onImageAvailable(android.media.ImageReader reader) {
    if (!(mIsWritingRawImage)) {
        mIsWritingRawImage = true;
        android.media.Image image = reader.acquireLatestImage();
        if (image != null) {
            mBackgroundHandler.post(new com.example.mjk.camera2videoimage.Camera2VideoImageActivity.ImageSaver(image, mCaptureResult, mCameraCharacteristics));
        }
    }
}