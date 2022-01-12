@java.lang.Override
public void doClose() {
    if (null == (sharedSftpClient)) {
        return ;
    }
    disconnectSftp(sharedSftpClient);
    sharedSftpClient = null;
    super.doClose();
}