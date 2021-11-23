@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    unregisterReceiver(mScreenStateReceiver);
    shouldDestroy = true;
    if ((lockScreenImageView) != null) {
        lockScreenImageView.setAlpha(0.0F);
        windowManager.removeView(lockScreenImageView);
    }
    if ((transparentViewToCheckFullScreen) != null)
        windowManager.removeView(transparentViewToCheckFullScreen);
    
}