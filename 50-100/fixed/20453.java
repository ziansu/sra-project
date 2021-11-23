@java.lang.Override
public void handleEvent(org.eclipse.swt.widgets.Event arg0) {
    arg0.doit = false;
    shell.setVisible(false);
    try {
        org.jnativehook.GlobalScreen.registerNativeHook();
    } catch (org.jnativehook.NativeHookException ex) {
        java.lang.System.exit(0);
    }
    org.jnativehook.GlobalScreen.addNativeKeyListener(new ui.MainGUI());
}