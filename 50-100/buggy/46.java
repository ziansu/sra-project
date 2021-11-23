@java.lang.Override
public void onDueDateSelected(java.util.Date date, long time) {
    super.onDueDateSelected(date, time);
    mReminderTextView.setEnabled(true);
    if ((mReminderTime) != (-1)) {
        java.util.Date reminder = getReminderDate(mReminderTime);
        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("LLL, EEE dd  HH:mm");
        mReminderTextView.setText(format.format(reminder));
    }
}