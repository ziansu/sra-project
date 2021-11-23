@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (ReminderBottomSheetDialog.UPDATE_REMINDER_REQUEST_CODE)) {
        long timestamp = data.getLongExtra(ReminderBottomSheetDialog.TIMESTAMP_BUNDLE_KEY, 0);
        java.util.Calendar calendar = new java.util.GregorianCalendar();
        calendar.setTime(new java.util.Date(timestamp));
        onReminderUpdated(calendar);
    }
}