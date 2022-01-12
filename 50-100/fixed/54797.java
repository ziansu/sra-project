@java.lang.Override
public boolean handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.tencent.qcloud.suixinbo.views.LiveActivity.UPDAT_WALL_TIME_TIMER_TASK :
            updateWallTime();
            break;
        case com.tencent.qcloud.suixinbo.views.LiveActivity.REFRESH_LISTVIEW :
            doRefreshListView();
            break;
        case com.tencent.qcloud.suixinbo.views.LiveActivity.TIMEOUT_INVITE :
            java.lang.String id = "" + (msg.obj);
            cancelInviteView(id);
            mLiveHelper.sendGroupMessage(Constants.AVIMCMD_MULTI_HOST_CANCELINVITE, id);
            break;
    }
    return false;
}