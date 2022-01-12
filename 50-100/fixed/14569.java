private int translateStatus(int status) {
    switch (status) {
        case UPLOAD_STATUS.PENDING :
            return me.ctknight.uploadmanager.UploadManager.STATUS_PENDING;
        case UPLOAD_STATUS.RUNNING :
            return me.ctknight.uploadmanager.UploadManager.STATUS_RUNNING;
        case me.ctknight.uploadmanager.UploadManager.STATUS_PAUSED :
            return me.ctknight.uploadmanager.UploadManager.STATUS_PAUSED;
        case UPLOAD_STATUS.SUCCESS :
            return me.ctknight.uploadmanager.UploadManager.STATUS_SUCCESSFUL;
        case UPLOAD_STATUS.WAITING_TO_RETRY :
        case UPLOAD_STATUS.WAITING_FOR_NETWORK :
        case UPLOAD_STATUS.WAITING_FOR_WIFI :
        default :
            assert me.ctknight.uploadmanager.UploadContract.isStatusError(status);
            return me.ctknight.uploadmanager.UploadManager.STATUS_FAILED;
    }
}