@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.support.v13.app.FragmentCompat.requestPermissions(parent, new java.lang.String[]{ Manifest.permission.CAMERA , Manifest.permission.INTERNET }, com.tapifolti.emotiondetection.EmotionDetectionFragment.REQUEST_APP_PERMISSION);
}