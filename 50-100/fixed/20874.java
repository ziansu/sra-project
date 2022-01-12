@java.lang.Override
public void nativeKeyReleased(org.jnativehook.keyboard.NativeKeyEvent k) {
    if ((k.getKeyCode()) == (hotkey)) {
        if (started) {
            started = false;
            clicker.stopclick();
            try {
                clicker.stop();
            } catch (java.lang.Exception e) {
            }
        }
    }
}