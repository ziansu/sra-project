@java.lang.Override
public void onResume() {
    super.onResume();
    com.app.sircle.UI.Fragment.CameraFragment.imageData = null;
    if (com.app.sircle.UI.Activity.BaseActivity.jumpToFragment) {
        getActivity().finish();
    }
    toggleFlashButtonVisibility(View.VISIBLE);
    showBackCamera();
    enableButtons(true);
}