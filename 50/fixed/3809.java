@java.lang.Override
public void onCompleted() {
    if ((downloadListener) != null) {
        downloadListener.onComplete();
    }
    downloadInfo.setState(DownloadInfo.FINISH);
}