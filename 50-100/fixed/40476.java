private static void releaseLock(java.util.concurrent.locks.ReentrantLock lock) {
    lock.unlock();
    if ((lock.getHoldCount()) == 0) {
        if (uk.ac.diamond.scisoft.analysis.io.HDF5Loader.openFiles.containsValue(lock)) {
            for (java.util.Map.Entry<java.lang.String, java.util.concurrent.locks.ReentrantLock> e : uk.ac.diamond.scisoft.analysis.io.HDF5Loader.openFiles.entrySet()) {
                if (e.getValue().equals(lock)) {
                    uk.ac.diamond.scisoft.analysis.io.HDF5Loader.openFiles.remove(e.getKey());
                }
            }
        }
    }
}