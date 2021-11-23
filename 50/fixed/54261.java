public void dlStop(java.lang.String url) {
    synchronized(cn.aigestudio.downloader.bizs.DLManager.sTaskDLing) {
        if (cn.aigestudio.downloader.bizs.DLManager.sTaskDLing.containsKey(url)) {
            cn.aigestudio.downloader.bizs.DLManager.DLTask task = cn.aigestudio.downloader.bizs.DLManager.sTaskDLing.get(url);
            task.setStop(true);
            cn.aigestudio.downloader.bizs.DLManager.sTaskDLing.remove(url);
        }
    }
}