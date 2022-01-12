@java.lang.Override
public void onCameraAvailable(@android.support.annotation.NonNull
java.lang.String cameraId) {
    super.onCameraAvailable(cameraId);
    if (proto.ttt.cds.green_data.Class.SequencePictureTaker.DEBUG)
        android.util.Log.d(proto.ttt.cds.green_data.Class.SequencePictureTaker.TAG, ("onCameraAvailable, id = " + cameraId));
    
    updateUnavailableCameras(("" + cameraId), false);
    if (!(mCamPendingList.isEmpty())) {
        java.lang.String nextCamId = mCamPendingList.poll();
        mCurrCameraId = java.lang.Integer.parseInt(nextCamId);
        takePicture();
    }
}