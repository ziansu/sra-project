@java.lang.Override
public void run() {
    try {
        mWSClient.stop();
        mConnected.set(false);
    } catch (java.lang.InterruptedException e) {
        com.facebook.buck.intellij.plugin.ws.BuckClient.LOG.debug(("Could not disconnect from buck. " + e));
    } catch (java.lang.Throwable t) {
        com.facebook.buck.intellij.plugin.ws.BuckClient.LOG.error(("Could not disconnect from buck. " + (t.getMessage())));
    }
}