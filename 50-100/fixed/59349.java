private void notifyUnreadCountChanged(final int position) {
    final android.content.Context context = getContext();
    final com.squareup.otto.Bus bus = org.mariotaku.twidere.app.TwidereApplication.getInstance(context).getMessageBus();
    if (bus != null) {
        mHandler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                bus.post(new org.mariotaku.twidere.util.message.UnreadCountUpdatedEvent(position));
            }
        });
    }
    notifyContentObserver(UnreadCounts.CONTENT_URI);
}