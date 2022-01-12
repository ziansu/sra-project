public void deleteFile(java.lang.String fileName) throws java.io.IOException {
    establishConnection();
    if (!(checkRemoteFileExists(fileName))) {
        throw new java.io.IOException("File not found");
    }
    if (ftpClient.deleteFile(fileName)) {
        java.lang.System.out.println((("File \"" + fileName) + "\" successfully deleted"));
    }else {
        throw new java.io.IOException("Unable to delete file");
    }
    disconnect();
}