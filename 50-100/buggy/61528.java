@java.lang.Override
public void nativeKeyPressed(org.jnativehook.keyboard.NativeKeyEvent k) {
    if ((on) && ((k.getKeyCode()) == (hotkey))) {
        if (!(started)) {
            java.lang.System.out.println(k.getKeyChar());
            started = true;
            int ms = java.lang.Integer.parseInt(msbtwclickstextfield.getText());
            clicker = new autoclicker.AutoClicker(ms);
            clicker.startclick();
            clicker.start();
        }
    }
}