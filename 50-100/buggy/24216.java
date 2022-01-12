@java.lang.Override
public void moveFile(java.lang.String fromFilePath, java.lang.String toFilePath, boolean closeSession) {
    com.jcraft.jsch.ChannelSftp sftp = null;
    try {
        sftp = openConnectedChannel(org.jumpmind.metl.core.runtime.resource.SftpDirectory.CHANNEL_1);
        sftp.cd(basePath);
        sftp.rename(fromFilePath, toFilePath);
    } catch (java.lang.Exception e) {
        throw new org.jumpmind.exception.IoException("Error moving (renaming) file.  Error %s", e.getMessage());
    } finally {
        if (closeSession) {
            close();
        }
    }
}