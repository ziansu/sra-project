private void stopImgWork() {
    if ((m_DownloadImageTask.getStatus()) == (com.google.android.gms.common.api.Status.RUNNING)) {
        m_DownloadImageTask.cancel(true);
    }
}