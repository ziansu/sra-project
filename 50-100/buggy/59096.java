@java.lang.Override
public void run() {
    for (com.seafile.seadroid2.monitor.AutoUpdateInfo info : infos) {
        if ((info.version) == 2) {
            android.util.Log.d(com.seafile.seadroid2.monitor.AutoUpdateManager.DEBUG_TAG, ("[by block] auto updated addUploadTask " + (info.localPath)));
            txService.addTaskToUploadQue(info.account, info.repoID, info.repoName, info.parentDir, info.localPath, true, true, info.version);
        }else {
            android.util.Log.d(com.seafile.seadroid2.monitor.AutoUpdateManager.DEBUG_TAG, ("auto updated addUploadTask " + (info.localPath)));
            txService.addUploadTask(info.account, info.repoID, info.repoName, info.parentDir, info.localPath, true, true);
        }
    }
}