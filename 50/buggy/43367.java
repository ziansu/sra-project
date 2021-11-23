@java.lang.Override
public void onAdLoaded() {
    if ((mUnityListener) != null) {
        if ((!(mPopupWindow.isShowing())) && (!(mHidden))) {
            showPopUpWindow();
        }
        mUnityListener.onAdLoaded();
    }
}