public com.lody.virtual.helper.proto.AppTaskInfo toTaskInfo() {
    com.lody.virtual.service.am.ActivityRecord top = activityList.getLast();
    android.content.ComponentName topActivity = null;
    if (top != null) {
        topActivity = new android.content.ComponentName(top.activityInfo.packageName, top.activityInfo.name);
    }
    return new com.lody.virtual.helper.proto.AppTaskInfo(taskId, baseActivity, topActivity);
}