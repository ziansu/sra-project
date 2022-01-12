@java.lang.Override
public java.lang.Void call() throws java.io.IOException {
    try {
        while (!(java.lang.Thread.currentThread().isInterrupted())) {
            try {
                readEntireFile();
            } catch (java.nio.file.NoSuchFileException | java.nio.file.AccessDeniedException exception) {
                java.lang.Thread.sleep(100);
            }
            invokeListenersWithReset();
        } 
    } catch (final java.lang.InterruptedException e) {
    } catch (final java.nio.channels.ClosedByInterruptException e) {
    }
    return null;
}