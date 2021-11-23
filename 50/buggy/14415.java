public boolean checkLowDiskSpace() {
    final java.io.File storageDir = new java.io.File(storagePath);
    final long freeSpace = storageDir.getFreeSpace();
    return freeSpace < (freeSpaceLimit);
}