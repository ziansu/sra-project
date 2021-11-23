public void deleteAlarm(int callBackID) {
    for (com.miwa.time.Alarm a : new java.util.ArrayList<com.miwa.time.Alarm>(alarms)) {
        if ((a.getCallback().getCallbackid()) == callBackID) {
            a.stopAlarm();
            alarms.remove(a);
            break;
        }
    }
}