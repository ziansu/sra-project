@java.lang.Override
public boolean renameFile(java.lang.String fromFilePath, java.lang.String toFilePath, boolean closeSession) {
    com.jcraft.jsch.ChannelSftp sftp = null;
    try {
        sftp = openConnectedChannel(org.jumpmind.metl.core.runtime.resource.SftpDirectory.CHANNEL_1);
        sftp.cd(basePath);
        sftp.rename(fromFilePath, toFilePath);
        return true;
    } catch (java.lang.Exception e) {
        return false;
    } finally {
        if (closeSession) {
            close();
        }
    }
}