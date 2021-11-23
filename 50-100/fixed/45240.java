public void ircRun() throws java.io.IOException, java.lang.InterruptedException, org.jibble.pircbot.IrcException {
    while ((java.lang.System.currentTimeMillis()) < (kickWaitTime)) {
        java.lang.Thread.sleep(15000);
    } 
    setVersion(getAdvertString());
    connect("irc.freenode.net");
    joinChannel("#electrum");
    joinChannel("#jelectrum");
    synchronized(connection_lock) {
        connection_lock.wait();
    }
    while ((java.lang.System.currentTimeMillis()) < (kickWaitTime)) {
        java.lang.Thread.sleep(15000);
    } 
    disconnect();
}