public boolean upload(java.lang.String localPath, java.lang.String remotePath) throws java.io.IOException {
    java.io.File file = new java.io.File(localPath);
    boolean isDir = file.isDirectory();
    boolean uploaded = true;
    makeDirectories((isDir ? remotePath : getPathParent(remotePath)));
    if (isDir)
        uploaded = uploadDirectory(localPath, remotePath);
    else
        uploaded = uploadFile(localPath, remotePath);
    
    return uploaded;
}