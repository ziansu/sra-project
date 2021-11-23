private void uiThreadCheck() {
    if (java.awt.EventQueue.isDispatchThread()) {
        Outermost_Package.RunGame.printStackTraceAndCrashTheProgramBecause("Only the UI thread can access this data");
    }
}