@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.easemob.chatuidemo.activity.MainActivity.activityInstance = null;
    if ((conflictBuilder) != null) {
        conflictBuilder.create().dismiss();
        conflictBuilder = null;
    }
}