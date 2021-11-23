public void destroy() {
    if (((ddf.catalog.core.ftp.FtpServerStarter.server) != null) && (!(isStopped()))) {
        ddf.catalog.core.ftp.FtpServerStarter.server.stop();
        ddf.catalog.core.ftp.FtpServerStarter.LOGGER.debug("FTP server stopped");
    }
}