@java.lang.Override
public void run() {
    try {
        removeInvalidTokens();
        invalidateSessions();
    } catch (java.lang.Exception ignore) {
    }
}