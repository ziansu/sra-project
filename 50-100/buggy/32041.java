@java.lang.Override
public int incActiveTime() {
    mRealm.beginTransaction();
    georgikoemdzhiev.activeminutes.data_layer.db.Activity activity = getOrCreateTodayUserActivity();
    int currentActiveTime = activity.getActiveTime();
    activity.setActiveTime((currentActiveTime + (INCREMENT_VALUE)));
    mRealm.copyToRealmOrUpdate(activity);
    mRealm.commitTransaction();
    debugActivityTable();
    return activity.getActiveTime();
}