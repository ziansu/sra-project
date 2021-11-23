public void success(com.bopr.android.smailer.MailMessage message) {
    com.bopr.android.smailer.ActivityLogItem item = new com.bopr.android.smailer.ActivityLogItem(com.bopr.android.smailer.ActivityLog.LEVEL_INFO);
    item.setMessage(formatMessage(message, R.string.activity_log_message_send_email_success));
    add(item);
}