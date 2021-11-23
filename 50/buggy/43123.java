@java.lang.Override
public void close() throws java.lang.Exception {
    recoverContext();
    try {
        serverSession.close(false);
    } finally {
        resetContext();
    }
}