@java.lang.Override
public void handleMessage(android.os.Message msg) {
    if (!(refreshing)) {
        if ((msg.what) == (TriggerService.MSG_REFRESH)) {
            triggerAction.getList(BaseAction.REQUEST_REFRESH, trigger.getResult(), trigger.getPath(), trigger.getWorkSpace(), false);
            refreshing = true;
        }
    }
}