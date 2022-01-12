private java.util.List<cn.woblog.android.downloader.domain.DownloadThreadInfo> converDownloadThreadInfos1(java.util.List<cn.woblog.android.downloader.simple.domain.MyDownloadThreadInfoLocal> downloadThreadInfosLocal) {
    java.util.List<cn.woblog.android.downloader.domain.DownloadThreadInfo> downloadThreadInfos = new java.util.ArrayList<>();
    for (cn.woblog.android.downloader.simple.domain.MyDownloadThreadInfoLocal d : downloadThreadInfosLocal) {
        downloadThreadInfos.add(convertDownloadThreadInfo(d));
    }
    return downloadThreadInfos;
}