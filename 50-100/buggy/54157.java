public void downloadDir(java.lang.String direntName) {
    if (!(com.seafile.seadroid2.util.Utils.isNetworkOn())) {
        com.seafile.seadroid2.ui.ToastUtils.show(this, R.string.network_down);
        return ;
    }
    final java.lang.String repoName = navContext.getRepoName();
    final java.lang.String repoID = navContext.getRepoID();
    final java.lang.String filePath = com.seafile.seadroid2.util.Utils.pathJoin(navContext.getDirPath(), direntName);
    com.seafile.seadroid2.ui.activity.ConcurrentAsyncTask.execute(new com.seafile.seadroid2.ui.activity.BrowserActivity.DownloadDirTask(), repoName, repoID, filePath);
}