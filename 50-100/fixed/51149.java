public void upload(java.lang.String localPath, java.lang.String remotePath) throws java.io.IOException {
    java.io.File file = new java.io.File(localPath);
    boolean isDir = file.isDirectory();
    makeDirectories((isDir ? remotePath : getPathParent(remotePath)));
    if (isDir)
        uploadDirectory(localPath, remotePath);
    else
        uploadFile(localPath, remotePath);
    
}