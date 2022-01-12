public void terminate() throws java.lang.Exception {
    try {
        lock.writeLock().lock();
        for (com.infiniteautomation.mango.io.serial.SerialPortIdentifier id : ownedPorts) {
            try {
                id.getPort().close();
            } catch (java.lang.Exception e) {
                LOG.error(e.getMessage(), e);
            }
        }
        ownedPorts.clear();
    } catch (java.lang.Exception e) {
        throw e;
    } finally {
        lock.writeLock().unlock();
    }
}