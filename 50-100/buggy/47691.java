public void on(java.lang.String cmd, java.lang.Object[] args) {
    try {
        org.rapidoid.pages.Pages.callCmdHandler(x, screen, new org.rapidoid.html.Cmd(cmd, args));
    } catch (java.lang.Exception e) {
        if ((org.rapidoid.util.U.rootCause(e)) instanceof org.rapidoid.http.HttpExchangeException) {
            org.rapidoid.pages.Pages.store(x, screen);
            throw org.rapidoid.util.U.rte(e);
        }
    }
}