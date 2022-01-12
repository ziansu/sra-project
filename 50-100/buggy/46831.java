private void waitForPresence(org.kontalk.xmppserver.messages.XMPPResourceConnection session, int millis) {
    if (((session.getPresence()) == null) || ((session.getPriority()) < 0)) {
        try {
            java.lang.Thread.sleep(millis);
        } catch (java.lang.InterruptedException ignored) {
        }
    }
}