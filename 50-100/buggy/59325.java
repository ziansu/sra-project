@java.lang.Override
public void onFlushFileBuffers(java.lang.String fileName, net.decasdev.dokan.DokanFileInfo arg1) throws net.decasdev.dokan.DokanOperationException {
    log.debug(("[onFlushFileBuffers] " + fileName));
    org.opendedup.sdfs.io.DedupFileChannel ch = this.getFileChannel(fileName, arg1.handle);
    try {
        ch.force(true);
    } catch (java.lang.Exception e) {
        log.error(("unable to sync file " + fileName), e);
        throw new net.decasdev.dokan.DokanOperationException(net.decasdev.dokan.WinError.ERROR_WRITE_FAULT);
    }
}