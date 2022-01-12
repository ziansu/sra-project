@java.lang.Override
protected void onPostExecute(java.util.List<com.seafile.seadroid2.ui.activity.SeafDirent> dirents) {
    if (dirents == null) {
        if ((err) != null) {
            com.seafile.seadroid2.ui.ToastUtils.show(this, R.string.transfer_list_network_error);
        }
        return ;
    }
    if ((fileCount) == 0)
        com.seafile.seadroid2.ui.ToastUtils.show(this, R.string.transfer_download_no_task);
    else
        com.seafile.seadroid2.ui.ToastUtils.show(this, getResources().getQuantityString(R.plurals.transfer_download_started, fileCount, fileCount));
    
    getReposFragment().getAdapter().setDownloadTaskList(txService.getDownloadTaskInfosByPath(repoID, dirPath));
}