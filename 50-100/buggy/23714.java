public void sendEvent(android.app.Activity activity, T obj) {
    android.content.Intent intent = new android.content.Intent();
    if ((broadcastEventCreator) != null) {
        intent = broadcastEventCreator.onIntentEventCreated(intent, obj);
    }
    intent.setAction(filter);
    eventSendWaiting = true;
    android.util.Log.d("EVENT_SEND", filter);
    activity.sendBroadcast(intent);
}