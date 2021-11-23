public synchronized void addUploadTask(com.lk.hotelcheck.bean.UploadBean uploadBean) {
    uploadBean.setImageState(ImageUploadState.STATE_WAIT);
    mWaitTaskQueue.add(uploadBean);
    if ((mRuningTaskQueue.size()) < (com.lk.hotelcheck.service.UploadService.MAX_DOWNLOAD_SIZE)) {
        startNext();
    }
    sendBroadcast(uploadBean);
}