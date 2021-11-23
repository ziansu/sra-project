public void sendEvent(android.content.Context context, T obj) {
    android.content.Intent intent = new android.content.Intent();
    if ((broadcastEventCreator) != null) {
        intent = broadcastEventCreator.onIntentEventCreated(intent, obj);
    }
    intent.setAction(filter);
    eventSendWaiting = true;
    android.util.Log.d("EVENT_SEND", filter);
    context.sendBroadcast(intent);
}