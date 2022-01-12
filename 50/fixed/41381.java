@java.lang.Override
public void run() {
    try {
        removeInvalidTokens();
        invalidateSessions(null);
    } catch (java.lang.Exception ignore) {
    }
}