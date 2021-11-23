@java.lang.Override
public void onCompleted() {
    if ((downloadListener.get()) != null) {
        downloadListener.get().onComplete();
    }
    downloadInfo.setState(DownloadInfo.FINISH);
}