private void freeSpaceCheckAfterNewPageAdd() {
    final long newPagesAdded = amountOfNewPagesAdded.incrementAndGet();
    final long lastSpaceCheck = lastDiskSpaceCheck.get();
    if ((newPagesAdded - lastSpaceCheck) > (diskSizeCheckInterval)) {
        final java.io.File storageDir = new java.io.File(storagePath);
        final long freeSpace = storageDir.getFreeSpace();
        if (freeSpace < (freeSpaceLimit))
            callLowSpaceListeners(new com.orientechnologies.orient.core.storage.impl.local.OLowDiskSpaceInformation(freeSpace, freeSpaceLimit));
        
        lastDiskSpaceCheck.lazySet(newPagesAdded);
    }
}