public void addKeyListeners() {
    if ((dji.keysdk.KeyManager.getInstance()) != null) {
        removeKeyListeners();
        dji.keysdk.DJIKey keyC1 = dji.keysdk.RemoteControllerKey.create(RemoteControllerKey.CUSTOM_BUTTON_1);
        dji.keysdk.KeyManager.getInstance().addListener(keyC1, c1KeyListener);
        dji.keysdk.KeyManager.getInstance().addListener(dji.keysdk.RemoteControllerKey.create(RemoteControllerKey.CUSTOM_BUTTON_2), c2KeyListener);
    }
}