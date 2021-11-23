public boolean start() {
    if ((mBoard) == null)
        return false;
    
    try {
        com.fatminmin.pttnotifier.Common.enableSSLSocket();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
    cont = true;
    firstRun = true;
    java.lang.Thread worker = new java.lang.Thread(new com.fatminmin.pttnotifier.Crawler.LoopTask());
    worker.setDaemon(true);
    worker.start();
    return true;
}