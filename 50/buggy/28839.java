public void stopEmbeddedSftpServer() throws java.lang.InterruptedException {
    if (sshStarted) {
        sshd.stop();
        sshStarted = false;
    }
}