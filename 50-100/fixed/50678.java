private boolean isSessionPaused(com.gsma.rcs.core.ims.service.im.filetransfer.FileSharingSession session) {
    if (session == null) {
        throw new com.gsma.rcs.service.api.ServerApiGenericException(new java.lang.StringBuilder("Unable to check if transfer is paused since session with file transfer ID '").append(mFileTransferId).append("' not available!").toString());
    }
    if (!(isHttpTransfer())) {
        if (com.gsma.rcs.service.api.OneToOneFileTransferImpl.sLogger.isActivated()) {
            com.gsma.rcs.service.api.OneToOneFileTransferImpl.sLogger.info("Pause available only for HTTP transfer");
        }
        return false;
    }
    return session.isFileTransferPaused();
}