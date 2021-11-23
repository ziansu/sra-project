public void Sleep(boolean b) {
    com.example.magicmirror.FullscreenActivity.isSleeping = b;
    try {
        SetBright(0.1F);
    } catch (android.provider.Settings.SettingNotFoundException e) {
        e.printStackTrace();
    }
    SetOverlay((b ? 255 : 0));
    if (!b) {
        PostSetup();
    }
}