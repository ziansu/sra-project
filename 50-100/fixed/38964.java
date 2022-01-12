@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(((settings.pooling().cleanDelay()) * 1000));
        while (true) {
            clean();
            java.lang.Thread.sleep(((settings.pooling().cleanRate()) * 1000));
        } 
    } catch (java.lang.InterruptedException e) {
        io.openio.sds.socket.SocketPool.logger.debug("Pool cleaner thread interrupted");
    }
}