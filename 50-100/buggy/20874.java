@java.lang.Override
public void nativeKeyReleased(org.jnativehook.keyboard.NativeKeyEvent k) {
    if ((k.getKeyCode()) == (hotkey)) {
        if (started) {
            java.lang.System.out.println(k.getKeyChar());
            started = false;
            clicker.stopclick();
            try {
                clicker.stop();
            } catch (java.lang.Exception e) {
            }
        }
    }
}