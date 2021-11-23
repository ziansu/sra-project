private void reconnect() {
    try {
        java.lang.Thread.sleep(500);
        connector.reconnect();
    } catch (java.lang.Exception e1) {
        (retryCnt)++;
    }
    if ((retryCnt) > 40) {
        showErr("The server is down");
        java.lang.System.exit(1);
    }
}