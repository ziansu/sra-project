private void scheduleMessage(org.owntracks.android.messages.MessageBase m) {
    android.os.Bundle b = httpMessageToBundle(m);
    b.putString(Scheduler.BUNDLE_KEY_ACTION, Scheduler.ONEOFF_TASK_SEND_MESSAGE_HTTP);
    if (org.owntracks.android.App.isInForeground())
        sendMessage(b);
    else
        org.owntracks.android.App.getScheduler().scheduleMessage(b);
    
}