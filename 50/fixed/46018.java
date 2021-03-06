public void delete() throws java.io.IOException {
    acquireExclusiveLock();
    try {
        final com.orientechnologies.orient.core.storage.impl.local.paginated.atomicoperations.OAtomicOperation atomicOperation = storage.getAtomicOperationsManager().getCurrentOperation();
        deleteFile(atomicOperation, fileId, diskCache);
    } finally {
        releaseExclusiveLock();
    }
}