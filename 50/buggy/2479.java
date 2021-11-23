@java.lang.Override
public void onLastActivitiesSucceed(com.floatingmuseum.mocloud.data.entity.LastActivities lastActivities) {
    com.orhanobut.logger.Logger.d("Sync数据:onLastActivitiesSucceed");
    if (hasFirstSync) {
        syncOthers(lastActivities);
    }else {
        com.floatingmuseum.mocloud.utils.SPUtil.saveUserLastActivities(lastActivities);
        syncFinished("Sync last activities finished.");
    }
}