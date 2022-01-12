@java.lang.Override
public void onCameraAvailable(@android.support.annotation.NonNull
java.lang.String cameraId) {
    super.onCameraAvailable(cameraId);
    updateUnavailableCameras(("" + cameraId), false);
    if (!(mCamPendingList.isEmpty())) {
        java.lang.String nextCamId = mCamPendingList.poll();
        mCurrCameraId = java.lang.Integer.parseInt(nextCamId);
        takePicture();
    }
}