private static java.util.concurrent.locks.ReentrantLock acquireLock(java.lang.String file) {
    java.util.concurrent.locks.ReentrantLock lock;
    synchronized(uk.ac.diamond.scisoft.analysis.io.HDF5Loader.openFiles) {
        lock = uk.ac.diamond.scisoft.analysis.io.HDF5Loader.openFiles.get(file);
        if (lock == null) {
            lock = new java.util.concurrent.locks.ReentrantLock();
            uk.ac.diamond.scisoft.analysis.io.HDF5Loader.openFiles.put(file, lock);
        }
    }
    lock.lock();
    return lock;
}