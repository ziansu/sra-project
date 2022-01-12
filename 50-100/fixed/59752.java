@java.lang.Override
public void run() {
    android.database.Cursor cursor = null;
    try {
        cursor = mContentResolver.query(android.content.ContentUris.withAppendedId(android.net.Uri.parse(com.techyourchance.www.android_mvc_tutorial.sms.SmsMessagesManager.CONTENT_URI), id), com.techyourchance.www.android_mvc_tutorial.sms.SmsMessagesManager.COLUMNS_OF_INTEREST, null, null, com.techyourchance.www.android_mvc_tutorial.sms.SmsMessagesManager.DEFAULT_SORT_ORDER);
        java.util.List<com.techyourchance.www.android_mvc_tutorial.sms.SmsMessage> result = extractSmsMessagesFromCursor(cursor);
        notifySmsMessagesFetched(result);
    } finally {
        if (cursor != null)
            cursor.close();
        
    }
}