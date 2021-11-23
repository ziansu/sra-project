private void requestCameraPermission() {
    if (android.support.v13.app.FragmentCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CAMERA)) {
        new com.tapifolti.emotiondetection.EmotionDetectionFragment.ConfirmationDialog().show(getChildFragmentManager(), com.tapifolti.emotiondetection.EmotionDetectionFragment.FRAGMENT_DIALOG);
    }else {
        android.support.v13.app.FragmentCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.CAMERA }, com.tapifolti.emotiondetection.EmotionDetectionFragment.REQUEST_APP_PERMISSION);
    }
}