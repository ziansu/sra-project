public void stopEmbeddedFtpServer() {
    if (ftpStarted) {
        ftpd.stop();
        ftpStarted = false;
    }
}