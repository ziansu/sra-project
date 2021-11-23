@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    org.thoughtcrime.securesms.crypto.MasterSecret masterSecret = org.thoughtcrime.securesms.service.KeyCachingService.getMasterSecret(context);
    int reminderCount = intent.getIntExtra("reminder_count", 0);
    org.thoughtcrime.securesms.notifications.MessageNotifier.updateNotification(context, masterSecret, true, false, (reminderCount + 1));
    return null;
}