protected void tryOpen() throws java.io.IOException {
    if ((randomAccessFile.get()) == null) {
        doOpen();
    }else
        if (!(randomAccessFile.get().getChannel().isOpen())) {
            logger.debug("[tryOpen][file closed, reopen it]{}", file);
            doOpen();
        }
    
}