@java.lang.Override
public void onClick(android.view.View view) {
    android.content.SharedPreferences.Editor editor = getActivity().getSharedPreferences(com.flipcam.PermissionActivity.FC_SHARED_PREFERENCE, Context.MODE_PRIVATE).edit();
    editor.putBoolean("videoCapture", false);
    editor.commit();
    capturePic.setClickable(false);
    showImagePreview();
}