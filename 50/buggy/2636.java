@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    com.hl.hlcorelib.mvp.events.HLCoreEvent event = new com.hl.hlcorelib.mvp.events.HLCoreEvent(com.hl.homelanebuddy.Constants.NEXT_ALARM_EVENT, null);
    dispatchEvent(event);
}