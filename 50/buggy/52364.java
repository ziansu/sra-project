public static com.cpiz.android.playground.TakePicture.PhotoHelper.CameraLauncher create(android.app.Activity activity) {
    return new com.cpiz.android.playground.TakePicture.PhotoHelper.CameraLauncher(activity).setPortrait(true).setUseFrontCamera(false).setRatio(1, 1).setPreferredSize(1080, 1080);
}