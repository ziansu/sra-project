@java.lang.Override
public void saveKeyFrameMeta(java.io.File file, org.red5.io.flv.IKeyFrameDataAnalyzer.KeyFrameMeta meta) {
    try {
        rwLock.writeLock().lock();
        java.lang.String canonicalPath = file.getCanonicalPath();
        if (inMemoryMetaCache.containsKey(canonicalPath)) {
            inMemoryMetaCache.remove(canonicalPath);
        }
    } catch (java.io.IOException e) {
    } finally {
        rwLock.writeLock().unlock();
    }
    super.saveKeyFrameMeta(file, meta);
}