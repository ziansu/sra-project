public void checkFreeSpace() {
    final long freeSpace = walLocation.getFreeSpace();
    if (freeSpace < 0)
        return ;
    
    if (freeSpace < (freeSpaceLimit)) {
        for (java.lang.ref.WeakReference<com.orientechnologies.orient.core.storage.impl.local.OLowDiskSpaceListener> listenerWeakReference : lowDiskSpaceListeners) {
            final com.orientechnologies.orient.core.storage.impl.local.OLowDiskSpaceListener lowDiskSpaceListener = listenerWeakReference.get();
            if (lowDiskSpaceListener != null)
                lowDiskSpaceListener.lowDiskSpace(new com.orientechnologies.orient.core.storage.impl.local.OLowDiskSpaceInformation(freeSpace, freeSpaceLimit));
            
        }
    }
}