@java.lang.Override
public void doClose() {
    if ((sharedSftpClient) != null) {
        disconnectSftp(sharedSftpClient);
        sharedSftpClient = null;
    }
    super.doClose();
}