@java.lang.Override
public void start() {
    org.apache.flume.source.taildirectory.DirectoryTailSource.logger.info("Source Starting..");
    watchDirs = new java.util.HashSet<org.apache.flume.source.taildirectory.WatchDir>();
    counter.start();
    try {
        for (java.lang.String path : dirs) {
            org.apache.flume.source.taildirectory.WatchDir watchDir = new org.apache.flume.source.taildirectory.WatchDir(java.nio.file.FileSystems.getDefault().getPath(path), this, timeToUnlockFile, counter);
            watchDir.proccesEvents();
            watchDirs.add(watchDir);
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    super.start();
}