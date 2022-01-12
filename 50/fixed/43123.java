@java.lang.Override
public void close() throws java.lang.Exception {
    if ((serverSession) != null) {
        recoverContext();
        try {
            serverSession.close(false);
        } finally {
            resetContext();
        }
    }
}