@java.lang.Override
public boolean delete(java.lang.String relativePath, boolean closeSession) {
    com.jcraft.jsch.ChannelSftp sftp = null;
    try {
        sftp = (closeSession) ? openConnectedChannel() : openConnectedChannel(org.jumpmind.metl.core.runtime.resource.SftpDirectory.CHANNEL_1);
        sftp.cd(basePath);
        sftp.rm(relativePath);
        return true;
    } catch (java.lang.Exception e) {
        return false;
    } finally {
        if (closeSession) {
            close();
        }
    }
}