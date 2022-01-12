@java.lang.Override
public void addListeners() {
    org.jnativehook.GlobalScreen.setEventDispatcher(new org.jnativehook.dispatcher.SwingDispatchService());
    try {
        org.jnativehook.GlobalScreen.registerNativeHook();
    } catch (org.jnativehook.NativeHookException ex) {
        java.lang.System.err.println(("Error starting KeyHandler:\n" + ex));
        java.lang.System.err.println("Keyboard controls disabled");
    }
    org.jnativehook.GlobalScreen.addNativeKeyListener(this);
}