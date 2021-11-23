@java.lang.Override
public void onClick(android.view.View v) {
    mCameraIO.stopLiveView();
    mCameraIO.takePicture(new com.thibaudperso.sonycamera.sdk.TakePictureListener() {
        @java.lang.Override
        public void onResult(java.lang.String url) {
            mCameraIO.startLiveView(null);
            android.content.Intent intent = new android.content.Intent();
            intent.setAction(android.content.Intent.ACTION_VIEW);
            intent.setDataAndType(android.net.Uri.parse(url), "image/jpeg");
            startActivityForResult(intent, com.thibaudperso.sonycamera.timelapse.fragments.CameraSettingsFragment.TAKE_PICTURE_ACTIVITY_RESULT);
        }

        @java.lang.Override
        public void onError(com.thibaudperso.sonycamera.sdk.CameraIO.ResponseCode responseCode, java.lang.String responseMsg) {
        }
    });
}