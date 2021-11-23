private void restoreBrightness() {
    windowLayoutParams.screenBrightness = WindowManager.LayoutParams.BRIGHTNESS_OVERRIDE_NONE;
    window.setAttributes(windowLayoutParams);
    window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
}