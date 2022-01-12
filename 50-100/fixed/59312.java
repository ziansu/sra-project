public int transferFilesToServer(java.lang.String[] localFilePaths, java.lang.String remoteDir) {
    try {
        for (java.lang.String filePath : localFilePaths) {
            sshClient.newSCPFileTransfer().upload(filePath, remoteDir);
        }
        java.lang.System.out.println("Transfer Complete");
        return 0;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return -1;
    }
}