public static void main(java.lang.String[] args) {
    java.util.logging.Logger.getLogger(org.jnativehook.GlobalScreen.class.getPackage().getName()).setLevel(java.util.logging.Level.OFF);
    java.lang.System.out.println("Author is Maxim Baykalov");
    try {
        org.jnativehook.GlobalScreen.registerNativeHook();
        org.jnativehook.GlobalScreen.addNativeKeyListener(new ua.nure.maxim.baykalov.filecounter.Main());
        java.lang.System.out.println("Press ESC to stop process");
    } catch (org.jnativehook.NativeHookException e) {
        java.lang.System.err.println("Exit listener is crushed");
    }
    ua.nure.maxim.baykalov.filecounter.Main.counterThread = new ua.nure.maxim.baykalov.filecounter.CounterThread(args[0], args[1]);
    ua.nure.maxim.baykalov.filecounter.Main.counterThread.start();
}