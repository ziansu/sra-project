@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d(com.flipcam.VideoFragment.TAG, "click capture picture");
    android.content.SharedPreferences.Editor editor = getActivity().getSharedPreferences(com.flipcam.PermissionActivity.FC_SHARED_PREFERENCE, Context.MODE_PRIVATE).edit();
    editor.putBoolean("videoCapture", false);
    editor.commit();
    capturePic.setClickable(false);
    showImagePreview();
}