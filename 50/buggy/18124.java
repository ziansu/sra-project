@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    mDialog.dismiss();
    mDialog = null;
    tcd.training.com.calendar.ReminderTask.ReminderUtils.scheduleForReadingReminders(this);
    selectItemNavigation(R.id.nav_schedule);
}