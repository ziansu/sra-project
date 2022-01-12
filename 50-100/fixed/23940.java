@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (iconSelectionNewButton.isEnabled()) {
        resetPlaybackOptionsAndQueue(true, true);
    }
    try {
        org.jnativehook.GlobalScreen.unregisterNativeHook();
    } catch (org.jnativehook.NativeHookException e1) {
        e1.printStackTrace();
    }
    finalizeAndCloseWindow();
}