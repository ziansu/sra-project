@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == (com.thibaudperso.sonycamera.timelapse.fragments.CameraSettingsFragment.TAKE_PICTURE_ACTIVITY_RESULT)) && ((mCameraIO) != null)) {
        startLiveView();
    }
}