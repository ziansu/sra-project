public void handleInitResult(boolean val) {
    setInitSuccess(val);
    session.onSecurityInitialized();
}