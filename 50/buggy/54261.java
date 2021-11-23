public void dlStop(java.lang.String url) {
    if (cn.aigestudio.downloader.bizs.DLManager.sTaskDLing.containsKey(url)) {
        cn.aigestudio.downloader.bizs.DLManager.DLTask task = cn.aigestudio.downloader.bizs.DLManager.sTaskDLing.get(url);
        task.setStop(true);
    }
}