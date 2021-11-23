private static void setupGetEvents() {
    com.zulip.android.widget.ZulipWidget.asyncGetEvents = new com.zulip.android.networking.AsyncGetEvents(com.zulip.android.widget.ZulipWidget.intervalMilliseconds);
    com.zulip.android.widget.ZulipWidget.asyncGetEvents.start();
}