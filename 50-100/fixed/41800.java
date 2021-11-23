@java.lang.Override
public net.decasdev.dokan.DokanDiskFreeSpace onGetDiskFreeSpace(net.decasdev.dokan.DokanFileInfo arg0) throws net.decasdev.dokan.DokanOperationException {
    log.info("[onGetDiskFreeSpace]");
    try {
        net.decasdev.dokan.DokanDiskFreeSpace free = new net.decasdev.dokan.DokanDiskFreeSpace();
        free.freeBytesAvailable = (Main.volume.getCapacity()) - (Main.volume.getCurrentSize());
        free.totalNumberOfBytes = Main.volume.getCapacity();
        free.totalNumberOfFreeBytes = (Main.volume.getCapacity()) - (Main.volume.getCurrentSize());
        return free;
    } catch (java.lang.Exception e) {
        log.error("error getting free disk space", e);
        throw new net.decasdev.dokan.DokanOperationException(net.decasdev.dokan.WinError.ERROR_GEN_FAILURE);
    }
}