public boolean changeDir(com.felhr.usbmassstorageforandroid.filesystems.VFSFile file) {
    fatHandler.stopCaching();
    boolean result = fatHandler.changeDir(file.getFileName());
    fatHandler.continueCaching();
    return result;
}