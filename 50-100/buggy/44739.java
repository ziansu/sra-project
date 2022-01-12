@java.lang.Override
public void call(java.lang.Long aLong) {
    if (((downloadInfo.getState()) == (com.jady.retrofitclient.download.DownloadInfo.PAUSE)) || ((downloadInfo.getState()) == (com.jady.retrofitclient.download.DownloadInfo.STOP)))
        return ;
    
    downloadInfo.setState(DownloadInfo.DOWNLOAD);
    if ((downloadListener.get()) != null) {
        downloadListener.get().updateProgress(((float) (aLong)), downloadInfo.getContentLength(), completed);
    }
}