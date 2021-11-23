@java.lang.Override
public void handleEvent(org.eclipse.swt.widgets.Event arg0) {
    arg0.doit = false;
    shell.setVisible(false);
    try {
        org.jnativehook.GlobalScreen.registerNativeHook();
    } catch (org.jnativehook.NativeHookException ex) {
        java.lang.System.err.println("There was a problem registering the native hook.");
        java.lang.System.err.println(ex.getMessage());
        java.lang.System.exit(0);
    }
    org.jnativehook.GlobalScreen.addNativeKeyListener(new ui.MainGUI());
    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(org.jnativehook.GlobalScreen.class.getPackage().getName());
    logger.setLevel(java.util.logging.Level.OFF);
}