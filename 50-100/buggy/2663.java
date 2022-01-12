@java.lang.Override
public synchronized void start(final org.ehcache.spi.service.ServiceConfiguration<?> config, final org.ehcache.spi.ServiceProvider serviceProvider) {
    org.ehcache.internal.persistence.DefaultLocalPersistenceService.createLocationIfRequiredAndVerify(rootDirectory);
    try {
        lockFile = new java.io.File((((rootDirectory) + (java.io.File.separator)) + ".lock"));
        final java.io.RandomAccessFile rw = new java.io.RandomAccessFile(lockFile, "rw");
        lock = rw.getChannel().lock();
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(("Couldn't lock rootDir: " + (rootDirectory.getAbsolutePath())), e);
    }
}