public boolean changeDir(com.felhr.usbmassstorageforandroid.filesystems.VFSFile file) {
    boolean result = fatHandler.changeDir(file.getFileName());
    return result;
}