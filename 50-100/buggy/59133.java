protected void tryOpen() throws java.io.IOException {
    if ((randomAccessFile) == null) {
        doOpen();
    }else
        if (!(randomAccessFile.getChannel().isOpen())) {
            logger.debug("[tryOpen][file closed, reopen it]{}", file);
            doOpen();
        }
    
}