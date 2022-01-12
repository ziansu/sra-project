@java.lang.Override
public void onCloseFile(java.lang.String path, net.decasdev.dokan.DokanFileInfo arg1) throws net.decasdev.dokan.DokanOperationException {
    if (!(path.equals("\\"))) {
        try {
            log.debug(("[onClose] " + path));
            this.closeFileChannel(arg1.handle);
        } catch (java.lang.Exception e) {
            log.error(("unable to close file " + path), e);
        }
    }
}