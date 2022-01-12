@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    unregisterReceiver(mScreenStateReceiver);
    shouldDestroy = true;
    if ((lockScreenImageView) != null)
        windowManager.removeView(lockScreenImageView);
    
    if ((transparentViewToCheckFullScreen) != null)
        windowManager.removeView(transparentViewToCheckFullScreen);
    
}