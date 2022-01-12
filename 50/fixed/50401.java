private org.apache.ftpserver.listener.Listener getDefaultListener() {
    return ((org.apache.ftpserver.impl.DefaultFtpServer) (ddf.catalog.core.ftp.FtpServerStarter.server)).getListener(ddf.catalog.core.ftp.FtpServerStarter.DEFAULT_LISTENER);
}