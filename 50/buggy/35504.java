public void destroy() {
    if (!(isStopped())) {
        ddf.catalog.core.ftp.FtpServerStarter.server.stop();
        ddf.catalog.core.ftp.FtpServerStarter.LOGGER.debug("FTP server stopped");
    }
}