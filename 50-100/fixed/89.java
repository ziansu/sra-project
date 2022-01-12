@java.lang.Override
public void onClick(android.view.View view) {
    toggleFlash(mFlashOn);
    mFlashOn = !(mFlashOn);
    mBrightness = getWindow().getAttributes().screenBrightness;
    if ((mBrightness) < 0) {
        try {
            mBrightness = Settings.System.getInt(getContentResolver(), Settings.System.SCREEN_BRIGHTNESS);
        } catch (android.provider.Settings e) {
            e.printStackTrace();
        }
    }
}