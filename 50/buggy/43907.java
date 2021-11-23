public void error(com.bopr.android.smailer.MailMessage message, java.lang.Exception error) {
    com.bopr.android.smailer.ActivityLogItem item = new com.bopr.android.smailer.ActivityLogItem(com.bopr.android.smailer.ActivityLog.LEVEL_ERROR);
    item.setMessage(formatMessage(message, R.string.activity_log_message_send_email_failed));
    item.setDetails(error.toString());
    add(item);
}