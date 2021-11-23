public void refreshFreeCommPorts() throws com.infiniteautomation.mango.io.serial.SerialPortConfigException {
    this.lock.writeLock().lock();
    freePorts.clear();
    initialize(false);
    this.lock.writeLock().unlock();
}