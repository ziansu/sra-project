@java.lang.Override
public void nativeKeyReleased(org.jnativehook.keyboard.NativeKeyEvent e) {
    if (((e.getKeyCode()) == (org.jnativehook.keyboard.NativeKeyEvent.VC_ALT_L)) && ((this.mode) == (KeyboardMode.ACTIVE))) {
        this.alt = false;
        if ((!(this.bspace)) && (this.keypressed)) {
            doType(java.awt.event.KeyEvent.VK_BACK_SPACE);
        }else {
            this.bspace = false;
        }
        doType(java.awt.event.KeyEvent.VK_BACK_SPACE);
    }
}