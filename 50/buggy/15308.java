public byte[] readFile(com.felhr.usbmassstorageforandroid.filesystems.VFSFile file) {
    fatHandler.stopCaching();
    byte[] data = fatHandler.readFile(file.getFileName());
    fatHandler.continueCaching();
    return data;
}