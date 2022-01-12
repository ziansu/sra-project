public static synchronized com.android.dialer.calllog.DefaultVoicemailNotifier getInstance(android.content.Context context) {
    if ((com.android.dialer.calllog.DefaultVoicemailNotifier.sInstance) == null) {
        android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
        android.content.ContentResolver contentResolver = context.getContentResolver();
        com.android.dialer.calllog.DefaultVoicemailNotifier.sInstance = new com.android.dialer.calllog.DefaultVoicemailNotifier(context, notificationManager, com.android.dialer.calllog.DefaultVoicemailNotifier.createNewCallsQuery(contentResolver), com.android.dialer.calllog.DefaultVoicemailNotifier.createNameLookupQuery(contentResolver));
    }
    return com.android.dialer.calllog.DefaultVoicemailNotifier.sInstance;
}