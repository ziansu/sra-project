private void startServer() {
    if ((isStopped()) || (isSuspended())) {
        try {
            ddf.catalog.core.ftp.FtpServerStarter.server.start();
            ddf.catalog.core.ftp.FtpServerStarter.LOGGER.debug("FTP server started on port {}", port);
        } catch (java.lang.Exception e) {
            ddf.catalog.core.ftp.FtpServerStarter.LOGGER.error("Failed to start FTP server", e);
        }
    }
}