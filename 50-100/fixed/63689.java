public void Sleep(boolean b) {
    com.example.magicmirror.FullscreenActivity.isSleeping = b;
    if (b) {
        try {
            SetBright(0.1F);
        } catch (android.provider.Settings.SettingNotFoundException e) {
        }
    }else {
        try {
            SetBright(1);
        } catch (android.provider.Settings.SettingNotFoundException e) {
        }
    }
    SetOverlay((b ? 255 : 0));
    if (!b) {
        PostSetup();
    }
}