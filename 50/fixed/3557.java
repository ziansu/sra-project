public void takePicture(final android.hardware.Camera.PictureCallback callback) {
    if ((mCamera) != null) {
        mCamera.takePicture(mShutterCallback, null, callback);
        android.widget.Toast.makeText(getContext(), R.string.shutter, Toast.LENGTH_SHORT).show();
    }
}