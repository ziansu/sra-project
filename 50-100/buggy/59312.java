public int transferFilesToServer(java.lang.String[] localFilePaths, java.lang.String remoteDir) {
    for (java.lang.String filePath : localFilePaths) {
        try {
            sshClient.newSCPFileTransfer().upload(filePath, remoteDir);
            java.lang.System.out.println("Transfer Complete");
            return 0;
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    return -1;
}