@java.lang.Override
public void doDownload(com.allen.guide.model.entities.GuideBean guideBean, final com.allen.guide.module.listener.IDownLoadListener downLoadListener) {
    java.lang.String fileName = guideBean.getFile();
    if (fileName != null) {
        java.lang.String url = ((com.allen.guide.config.URLs.GUIDE) + "?fileName=") + fileName;
        android.util.Log.d("Allen-----", ("GuideModel->doDownload: " + url));
        com.allen.guide.net.DownloadUtil downloadUtil = new com.allen.guide.net.DownloadUtil();
        downloadUtil.start(url, downLoadListener);
    }else {
        downLoadListener.onDownLoadFail("无此文件");
    }
}