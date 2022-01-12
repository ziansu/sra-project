public static void waitForSwingThreads() {
    try {
        javax.swing.SwingUtilities.invokeAndWait(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
            }
        });
    } catch (java.lang.reflect.InvocationTargetException e) {
        throw new java.lang.IllegalStateException(e);
    } catch (java.lang.InterruptedException e) {
        throw new java.lang.IllegalStateException(e);
    }
}