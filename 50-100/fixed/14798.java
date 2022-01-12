public boolean deleteFile(java.lang.String fileName) throws java.io.IOException {
    boolean status = false;
    establishConnection();
    if (!(checkRemoteFileExists(fileName))) {
        return status;
    }
    if (ftpClient.deleteFile(fileName)) {
        java.lang.System.out.println((("File \"" + fileName) + "\" successfully deleted"));
        status = true;
    }else {
        throw new java.io.IOException("Unable to delete file");
    }
    disconnect();
    return status;
}