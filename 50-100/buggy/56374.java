@java.lang.Override
public void onSetEndOfFile(java.lang.String fileName, long length, net.decasdev.dokan.DokanFileInfo arg2) throws net.decasdev.dokan.DokanOperationException {
    try {
        log.debug(("[onSetEndOfFile] " + fileName));
        org.opendedup.sdfs.io.DedupFileChannel ch = this.getFileChannel(fileName, arg2.handle);
        ch.truncateFile(length);
    } catch (java.lang.Exception e) {
        log.error(((("Unable to set length  of " + fileName) + " to ") + length));
        throw new net.decasdev.dokan.DokanOperationException(net.decasdev.dokan.WinError.ERROR_WRITE_FAULT);
    }
}