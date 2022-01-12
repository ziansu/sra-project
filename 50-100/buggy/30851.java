private void scheduleMessage(org.owntracks.android.messages.MessageBase m) {
    try {
        android.os.Bundle b = httpMessageToBundle(m);
        b.putString(Scheduler.BUNDLE_KEY_ACTION, Scheduler.ONEOFF_TASK_SEND_MESSAGE_HTTP);
        if (org.owntracks.android.App.isInForeground())
            sendMessage(b);
        else
            org.owntracks.android.App.getScheduler().scheduleMessage(b);
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (org.owntracks.android.support.Parser e) {
        e.printStackTrace();
    }
}