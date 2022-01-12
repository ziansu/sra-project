@java.lang.Override
public void run() {
    com.carnifex.rsyncmover.web.Server.logger.info("Web server successfully initialized");
    for (; ;) {
        try {
            final java.net.Socket s = socket.accept();
            new com.carnifex.rsyncmover.web.Server.ServerThread(s).start();
        } catch (java.io.IOException e) {
            final java.lang.String msg = "IOException from server socket";
            com.carnifex.rsyncmover.web.Server.logger.error(msg, e);
            audit.addError(msg, e);
        }
    }
}