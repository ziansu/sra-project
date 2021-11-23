private boolean isSessionPaused(com.gsma.rcs.core.ims.service.im.filetransfer.FileSharingSession session) {
    if (session == null) {
        throw new com.gsma.rcs.service.api.ServerApiGenericException((("Unable to check if transfer is paused since session with file transfer ID '" + (mFileTransferId)) + "' not available!"));
    }
    if (!(isHttpTransfer())) {
        if (com.gsma.rcs.service.api.OneToOneFileTransferImpl.sLogger.isActivated()) {
            com.gsma.rcs.service.api.OneToOneFileTransferImpl.sLogger.info("Pause available only for HTTP transfer");
        }
        return false;
    }
    return ((com.gsma.rcs.core.ims.service.im.filetransfer.http.HttpFileTransferSession) (session)).isFileTransferPaused();
}