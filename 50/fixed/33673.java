public void stopEmbeddedFtpServer() {
    if (ftpStarted) {
        if ((ftpd) != null) {
            ftpd.stop();
        }
        ftpStarted = false;
    }
}