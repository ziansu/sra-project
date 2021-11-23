private void setAppBlockNotificationsSetting(java.lang.String packageName, int uid, java.lang.String enableOrDisable) {
    int state;
    if (enableOrDisable.equals("enable")) {
        state = 1;
    }else {
        state = 0;
    }
    java.lang.String command = (((("service call notification 6 s16 " + packageName) + " i32 ") + uid) + " i32 ") + state;
    sendShellCommand(command);
}