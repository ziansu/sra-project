public void notifyListener() {
    timeStamp = file.lastModified();
    fileSize = file.length();
    listener.fileUpdated();
}