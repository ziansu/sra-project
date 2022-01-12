@java.lang.Override
public void run() {
    for (com.seafile.seadroid2.monitor.AutoUpdateInfo info : infos) {
        if ((info.version) == 2) {
            txService.addTaskToUploadQue(info.account, info.repoID, info.repoName, info.parentDir, info.localPath, true, true, info.version);
        }else {
            txService.addUploadTask(info.account, info.repoID, info.repoName, info.parentDir, info.localPath, true, true);
        }
    }
}