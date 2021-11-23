public void createDirIfNotExists(java.lang.String dirPath) throws org.seagrid.desktop.connectors.storage.SftpException {
    java.lang.String pwd = channelSftp.pwd();
    channelSftp.cd("/");
    java.lang.String[] folders = dirPath.split("/");
    for (java.lang.String folder : folders) {
        if ((folder.length()) > 0) {
            try {
                channelSftp.cd(folder);
            } catch (org.seagrid.desktop.connectors.storage.SftpException e) {
                channelSftp.mkdir(folder);
                channelSftp.cd(folder);
            }
        }
    }
    channelSftp.cd(pwd);
}