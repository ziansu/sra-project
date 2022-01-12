@java.lang.Override
public void rollbackCurrentTX() throws java.lang.Exception {
    if ((serverSession) != null) {
        recoverContext();
        try {
            serverSession.rollback(false);
        } finally {
            resetContext();
        }
    }
}